package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;

@Builder
@Entity
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;
}
