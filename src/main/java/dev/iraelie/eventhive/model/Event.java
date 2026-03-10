package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
