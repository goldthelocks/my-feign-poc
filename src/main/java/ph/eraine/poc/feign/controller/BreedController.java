package ph.eraine.poc.feign.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ph.eraine.poc.feign.dto.ApiResponse;
import ph.eraine.poc.feign.dto.Breed;
import ph.eraine.poc.feign.service.BreedService;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/v1/breeds")
public class BreedController {

    private final BreedService service;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Breed>>> viewBreeds(@RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer limit) {
        log.info("Retrieving cat breeds.");
        return ResponseEntity.ok(ApiResponse.<List<Breed>>builder()
                .data(service.getBreeds(page, limit))
                .build());
    }

}