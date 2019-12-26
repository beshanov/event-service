package com.beshanov.meetupapp.eventservice;

import com.beshanov.meetupapp.eventservice.domain.Event;
import com.beshanov.meetupapp.eventservice.repository.EventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class MongoPlayingArea {

    @Autowired
    EventRepository eventRepository;

    @Test
    void createEvent()
    {
        Event event = new Event();
        event.setAuthorId(11L);
        event.setTitle("newTitle2");
        eventRepository.save(event);
    }
}
