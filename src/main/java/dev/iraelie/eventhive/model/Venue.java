package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Builder
@Entity
public class Venue {
    @Id
    private Long id;
    private String name;
    private String address;
    private String city;
    private String country;
    private Set<Hall> halls;
}
