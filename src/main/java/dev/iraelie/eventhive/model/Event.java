package dev.iraelie.eventhive.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall")
    private Hall hall;

    private String name;
    private String description;
    private LocalDate date;
    private LocalTime timeStart;
    private LocalTime timeEnd;

    //    Will add bidirectional sync
}
