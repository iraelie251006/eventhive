package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Hall {
    private Long id;
    private Long venueId;
    private String name;
    private Long capacity;
    private Long event_id;
}
