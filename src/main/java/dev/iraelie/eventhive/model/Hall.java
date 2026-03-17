package dev.iraelie.eventhive.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
@Entity
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long venueId;

    @OneToMany(mappedBy = "hallId", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Long eventId;
    private String name;
    private Long capacity;
}
