package com.beshanov.meetupapp.eventservice.controllers;

import com.beshanov.meetupapp.eventservice.model.EventsListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/events")
public class ProfileController {

    @GetMapping("/{userId}")
    public EventsListResponse getEventByUserId(@PathVariable String userId) {
        EventsListResponse eventsListResponse = new EventsListResponse();
        eventsListResponse.setEventsList(Arrays.asList("Event1", "NewEvent"));
        return eventsListResponse;
    }
}
