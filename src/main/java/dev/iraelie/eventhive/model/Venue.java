package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;

import java.util.Set;

@Entity
public class Venue {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String country;
    private Set<Hall> halls;
}
