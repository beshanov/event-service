package com.beshanov.meetupapp.eventservice.controllers;

import com.beshanov.meetupapp.eventservice.domain.Event;
import com.beshanov.meetupapp.eventservice.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Optional;

@RestController
public class EventsController {

    @Autowired
    EventRepository eventRepository;

    @GetMapping("/events/{eventId}")
    public Event getEventsById(@PathVariable String eventId) {
        Optional<Event> event = eventRepository.findById(eventId);
        if(event.isPresent()) {
            return event.get();
        }
        System.err.println("there is no event with id " + eventId);
        return null;
    }

    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

}
