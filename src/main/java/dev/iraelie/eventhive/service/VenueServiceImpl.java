package dev.iraelie.eventhive.service;

import dev.iraelie.eventhive.dto.CreateVenueRequest;
import dev.iraelie.eventhive.model.Venue;
import dev.iraelie.eventhive.repository.VenueRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class VenueServiceImpl implements VenueInterface {
    private final VenueRepository venueRepository;

    @Override
    public void createVenue(CreateVenueRequest request) {
        if (venueRepository.findByName(request.getName())) {
            throw new RuntimeException("Venue already exist");
        }

        Venue venue = Venue.builder()
                .name(request.getName())
                .address(request.getAddress())
                .city(request.getCity())
                .country(request.getCountry())
                .halls(Set.of((dev.iraelie.eventhive.model.Hall) request.getHalls()))
                .build();

        Venue savedVenue = venueRepository.save(venue);

        return;
    }
}
