package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import lombok.Builder;

@Builder
@Entity
public class Ticket {
    private Long id;
}
