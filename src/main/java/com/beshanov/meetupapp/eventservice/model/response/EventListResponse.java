package com.beshanov.meetupapp.eventservice.model.response;

import com.beshanov.meetupapp.eventservice.domain.Event;

import java.util.List;

public class EventListResponse {
    private List<Event> events;

    public EventListResponse() {
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
