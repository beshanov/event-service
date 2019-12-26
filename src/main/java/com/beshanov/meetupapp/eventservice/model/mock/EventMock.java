package com.beshanov.meetupapp.eventservice.model.mock;

import java.util.Calendar;

public class EventMock {

    private Long id;
    private String title;
    private Long authorId;
    private Calendar date;
    private Calendar creationDate;
    private String description;
    private String eventType;
    private String place;
    private String location;
    private String reference;
    private String participantsNumber;
    private String participantsAgeFrom;
    private String participantsAgeTo;
    private String privacyCategory;

    public EventMock() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getParticipantsNumber() {
        return participantsNumber;
    }

    public void setParticipantsNumber(String participantsNumber) {
        this.participantsNumber = participantsNumber;
    }

    public String getParticipantsAgeFrom() {
        return participantsAgeFrom;
    }

    public void setParticipantsAgeFrom(String participantsAgeFrom) {
        this.participantsAgeFrom = participantsAgeFrom;
    }

    public String getParticipantsAgeTo() {
        return participantsAgeTo;
    }

    public void setParticipantsAgeTo(String participantsAgeTo) {
        this.participantsAgeTo = participantsAgeTo;
    }

    public String getPrivacyCategory() {
        return privacyCategory;
    }

    public void setPrivacyCategory(String privacyCategory) {
        this.privacyCategory = privacyCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
