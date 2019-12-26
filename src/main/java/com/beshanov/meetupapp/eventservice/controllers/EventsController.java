package com.beshanov.meetupapp.eventservice.controllers;

import com.beshanov.meetupapp.eventservice.model.mock.EventMock;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
public class EventsController {

    @GetMapping("/events/{eventId}")
    public EventMock getEventsById(@PathVariable Long eventId) {
        //returns mock event object
        EventMock event = new EventMock();
        event.setId(eventId);
        event.setAuthorId(eventId);
        event.setDate(Calendar.getInstance());
        event.setDescription("description" + eventId);
        event.setEventType("type" + eventId);
        event.setPlace("place" + eventId);
        event.setTitle("title" + eventId);
        return event;
    }

    @PostMapping("/events")
    public EventMock createEvent(@RequestBody EventMock event) {
        //сохраняем event в базу
        //достаем и возвращаем
        event.setId(11111L);
        return event;
    }

}
