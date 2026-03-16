package dev.iraelie.eventhive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long hallId;
    private String name;
    private String description;
    private LocalDate date;
    private LocalTime timeStart;
    private LocalTime timeEnd;
}
