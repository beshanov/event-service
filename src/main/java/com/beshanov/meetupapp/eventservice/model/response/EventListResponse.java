package com.beshanov.meetupapp.eventservice.model.response;

import com.beshanov.meetupapp.eventservice.model.mock.EventMock;

import java.util.List;

public class EventListResponse {
    private List<EventMock> events;

    public EventListResponse() {
    }

    public List<EventMock> getEvents() {
        return events;
    }

    public void setEvents(List<EventMock> events) {
        this.events = events;
    }
}
