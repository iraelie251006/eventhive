package dev.iraelie.eventhive.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "userId")
    private Long userId;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private EventSeat eventSeatId;
    private TicketStatus status;
    private LocalDateTime createdAt;
}
