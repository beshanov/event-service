package com.beshanov.meetupapp.eventservice.model;

import java.util.List;

public class EventsListResponse {
    private List<String> eventsList;

    public EventsListResponse() {
    }

    public List<String> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<String> eventsList) {
        this.eventsList = eventsList;
    }
}

