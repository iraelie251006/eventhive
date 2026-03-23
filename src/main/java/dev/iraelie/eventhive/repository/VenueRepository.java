package dev.iraelie.eventhive.repository;

import dev.iraelie.eventhive.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
    boolean findByName(String name);
}
