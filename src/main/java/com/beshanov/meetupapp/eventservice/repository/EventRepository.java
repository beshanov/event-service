package com.beshanov.meetupapp.eventservice.repository;

import com.beshanov.meetupapp.eventservice.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
}
