package com.campuslands.dbcatalog.persistence.entities;

import jakarta.persistence.*;
@Entity
@Table(name="Chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "chapter_number")
    private String chapterNumber;
    @Column(name = "chapter_title")
    private String chapterTitle;

    @ManyToOne
    private Survey survey;

    public Chapter() {
    }

    public Chapter(String chapterNumber, String chapterTitle) {
        this.chapterNumber = chapterNumber;
        this.chapterTitle = chapterTitle;
    }

    //gettes y settes
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(String chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    @Override
    public String toString() {
        return "Chapter{" +
            "id=" + id +
            ", chapterNumber='" + chapterNumber + '\'' +
            ", chapterTitle='" + chapterTitle + '\'' +
            '}';
    }
}


