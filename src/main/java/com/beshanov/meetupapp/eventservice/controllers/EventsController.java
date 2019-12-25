package com.beshanov.meetupapp.eventservice.controllers;

import com.beshanov.meetupapp.eventservice.model.mock.EventMock;
import com.beshanov.meetupapp.eventservice.model.request.GetEventsByIdsRequest;
import com.beshanov.meetupapp.eventservice.model.response.EventListResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
public class EventsController {

    @PostMapping("/events")
    public EventListResponse getEventsByIds(@RequestBody GetEventsByIdsRequest request) {
        List<Long> eventsId = request.getEventsId();
        List<EventMock> events = new ArrayList<>();
        for (Long id : eventsId) {
            EventMock event = new EventMock();
            event.setId(id);
            event.setAuthorId(id);
            event.setDate(Calendar.getInstance());
            event.setDescription("description" + id);
            event.setEventType("type" + id);
            event.setPlace("place" + id);
            event.setTitle("title" + id);
            events.add(event);
        }
        EventListResponse response = new EventListResponse();
        response.setEvents(events);
        return response;
    }
}
