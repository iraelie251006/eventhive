package dev.iraelie.eventhive.model;

import jakarta.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "userId")
    private Long userId;
    private Long hallId;
    private String name;
    private String description;
    private LocalDate date;
    private LocalTime timeStart;
    private LocalTime timeEnd;
}
