package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;

@Builder
@Entity
public class Ticket {
    @Id
    private Long id;
}
