package com.xworkz.constitutionApp.constitution;


public class Constitution {

    private int id;
    private String country;
    private String language;
    private String mainArticles;
    private int totalPages;
    private String adoptionDate;
    private String supremeCourt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMainArticles() {
        return mainArticles;
    }

    public void setMainArticles(String mainArticles) {
        this.mainArticles = mainArticles;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(String adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getSupremeCourt() {
        return supremeCourt;
    }

    public void setSupremeCourt(String supremeCourt) {
        this.supremeCourt = supremeCourt;
    }
}
