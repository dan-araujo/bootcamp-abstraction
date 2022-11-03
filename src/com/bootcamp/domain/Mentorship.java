package com.bootcamp.domain;

import java.time.LocalDate;

public class Mentorship extends Contents {

    private LocalDate date;

    @Override
    public double calculateXP() {
        return STANDARD_XP * 20d;
    }

    public Mentorship() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + getDate() +
                '}';
    }
}
