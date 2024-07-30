package com.campuslands.dbcatalog.persistence.entities;

import java.time.LocalTime;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_response")
    private String nameResponse;
    @Column(name = "response_time")
    private LocalTime responseTime;
    @Column(name = "response_date")
    private Date responseDate;

    @ManyToOne
    private Survey survey;

    public Response() {
    }

    public Response(String nameResponse, LocalTime responseTime, Date responseDate) {
        this.nameResponse = nameResponse;
        this.responseTime = responseTime;
        this.responseDate = responseDate;
    }

    //gettes y settes
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameResponse() {
        return nameResponse;
    }

    public void setNameResponse(String nameResponse) {
        this.nameResponse = nameResponse;
    }

    public LocalTime getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(LocalTime responseTime) {
        this.responseTime = responseTime;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
}

