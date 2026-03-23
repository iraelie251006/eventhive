package dev.iraelie.eventhive.dto;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class CreateVenueRequest {
    private String name;
    private String address;
    private String city;
    private String country;
    private Set<HallRequest> halls;
}
