package ph.eraine.poc.feign.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import ph.eraine.poc.feign.client.BreedApiResponse;
import ph.eraine.poc.feign.client.CatApiClient;
import ph.eraine.poc.feign.dto.Breed;

import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class BreedService {

    private final CatApiClient client;

    public List<Breed> getBreeds(Integer page, Integer limit) {
        log.info("Retrieving breeds.");
        return client.getBreeds(page, limit).stream()
                .map(this::createBreed)
                .collect(Collectors.toList());
    }

    private Breed createBreed(BreedApiResponse response) {
        return Breed.builder()
                .name(response.getName())
                .temperaments(Arrays.asList(StringUtils.split(response.getTemperament(), ", ")))
                .description(response.getDescription())
                .build();
    }

}