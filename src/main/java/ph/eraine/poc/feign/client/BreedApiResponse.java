package ph.eraine.poc.feign.client;

import lombok.Data;

@Data
public class BreedApiResponse {

    private String id;
    private String name;
    private String temperament;
    private String description;

}