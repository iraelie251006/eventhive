package dev.iraelie.eventhive.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "venueId")
    private Long venueId;

    @OneToMany(mappedBy = "hallId", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Long eventId;

    private String name;

    @OneToMany(mappedBy = "hallId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Seat> seats;
}
