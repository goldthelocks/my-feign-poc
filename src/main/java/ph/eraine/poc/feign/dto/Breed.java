package ph.eraine.poc.feign.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class Breed {

    private String name;
    private List<String> temperaments;
    private String description;

}