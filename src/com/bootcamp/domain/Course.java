package com.bootcamp.domain;

public class Course extends Contents {

    private int hoursSchedule;

    @Override
    public double calculateXP() {
        return STANDARD_XP * hoursSchedule;
    }

    public Course() {
    }

    public int getHoursSchedule() {
        return hoursSchedule;
    }

    public void setHoursSchedule(int hoursSchedule) {
        this.hoursSchedule = hoursSchedule;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", HoursSchedule=" + getHoursSchedule() +
                '}';
    }
}
