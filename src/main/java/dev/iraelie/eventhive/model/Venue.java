package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Venue {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String country;
    private Set<Hall> halls;
}
