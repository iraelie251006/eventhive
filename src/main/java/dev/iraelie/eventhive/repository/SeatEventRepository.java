package dev.iraelie.eventhive.repository;

import dev.iraelie.eventhive.model.EventSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatEventRepository extends JpaRepository<EventSeat, Long> {
}
