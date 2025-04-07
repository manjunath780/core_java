package com.xworkz.festivalApp.festival;



public class Festival {

    private int id;
    private String name;
    private String date;
    private String country;
    private boolean isPublicHoliday;
    private int duration; // in days

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isPublicHoliday() {
        return isPublicHoliday;
    }

    public void setPublicHoliday(boolean isPublicHoliday) {
        this.isPublicHoliday = isPublicHoliday;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
