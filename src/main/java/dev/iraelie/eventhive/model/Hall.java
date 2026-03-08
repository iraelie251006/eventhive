package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
public class Hall {
    @Id
    private Long id;
    private Long venueId;
    private String name;
    private Long capacity;
    private Long event_id;
}
