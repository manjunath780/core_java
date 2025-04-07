package com.xworkz.festivalApp;


import com.xworkz.festivalApp.festival.Festival;

public class FestivalRunner {

    public static void main(String[] args) {
        System.out.println("FestivalRunner main started");

        Festival festival1 = new Festival();
        festival1.setId(1);
        festival1.setName("Diwali");
        festival1.setDate("November 12, 2025");
        festival1.setCountry("India");
        festival1.setPublicHoliday(true);
        festival1.setDuration(5);

        int id1 = festival1.getId();
        String name1 = festival1.getName();
        String date1 = festival1.getDate();
        String country1 = festival1.getCountry();
        boolean isPublicHoliday1 = festival1.isPublicHoliday();
        int duration1 = festival1.getDuration();

        Festival festival2 = new Festival();
        festival2.setId(2);
        festival2.setName("Christmas");
        festival2.setDate("December 25, 2025");
        festival2.setCountry("USA");
        festival2.setPublicHoliday(true);
        festival2.setDuration(1);

        int id2 = festival2.getId();
        String name2 = festival2.getName();
        String date2 = festival2.getDate();
        String country2 = festival2.getCountry();
        boolean isPublicHoliday2 = festival2.isPublicHoliday();
        int duration2 = festival2.getDuration();

        Festival festival3 = new Festival();
        festival3.setId(3);
        festival3.setName("Eid al-Fitr");
        festival3.setDate("May 2, 2025");
        festival3.setCountry("Pakistan");
        festival3.setPublicHoliday(true);
        festival3.setDuration(3);

        int id3 = festival3.getId();
        String name3 = festival3.getName();
        String date3 = festival3.getDate();
        String country3 = festival3.getCountry();
        boolean isPublicHoliday3 = festival3.isPublicHoliday();
        int duration3 = festival3.getDuration();

        Festival festival4 = new Festival();
        festival4.setId(4);
        festival4.setName("Thanksgiving");
        festival4.setDate("November 27, 2025");
        festival4.setCountry("USA");
        festival4.setPublicHoliday(true);
        festival4.setDuration(4);

        int id4 = festival4.getId();
        String name4 = festival4.getName();
        String date4 = festival4.getDate();
        String country4 = festival4.getCountry();
        boolean isPublicHoliday4 = festival4.isPublicHoliday();
        int duration4 = festival4.getDuration();

        Festival festival5 = new Festival();
        festival5.setId(5);
        festival5.setName("New Year's Day");
        festival5.setDate("January 1, 2025");
        festival5.setCountry("Global");
        festival5.setPublicHoliday(true);
        festival5.setDuration(1);

        int id5 = festival5.getId();
        String name5 = festival5.getName();
        String date5 = festival5.getDate();
        String country5 = festival5.getCountry();
        boolean isPublicHoliday5 = festival5.isPublicHoliday();
        int duration5 = festival5.getDuration();

        System.out.println("Festival ID: " + id1);
        System.out.println("Festival Name: " + name1);
        System.out.println("Festival Date: " + date1);
        System.out.println("Country: " + country1);
        System.out.println("Public Holiday: " + (isPublicHoliday1 ? "Yes" : "No"));
        System.out.println("Duration: " + duration1 + " days");
        System.out.println("------------------------------");

        System.out.println("Festival ID: " + id2);
        System.out.println("Festival Name: " + name2);
        System.out.println("Festival Date: " + date2);
        System.out.println("Country: " + country2);
        System.out.println("Public Holiday: " + (isPublicHoliday2 ? "Yes" : "No"));
        System.out.println("Duration: " + duration2 + " days");
        System.out.println("------------------------------");

        System.out.println("Festival ID: " + id3);
        System.out.println("Festival Name: " + name3);
        System.out.println("Festival Date: " + date3);
        System.out.println("Country: " + country3);
        System.out.println("Public Holiday: " + (isPublicHoliday3 ? "Yes" : "No"));
        System.out.println("Duration: " + duration3 + " days");
        System.out.println("------------------------------");

        System.out.println("Festival ID: " + id4);
        System.out.println("Festival Name: " + name4);
        System.out.println("Festival Date: " + date4);
        System.out.println("Country: " + country4);
        System.out.println("Public Holiday: " + (isPublicHoliday4 ? "Yes" : "No"));
        System.out.println("Duration: " + duration4 + " days");
        System.out.println("------------------------------");

        System.out.println("Festival ID: " + id5);
        System.out.println("Festival Name: " + name5);
        System.out.println("Festival Date: " + date5);
        System.out.println("Country: " + country5);
        System.out.println("Public Holiday: " + (isPublicHoliday5 ? "Yes" : "No"));
        System.out.println("Duration: " + duration5 + " days");
        System.out.println("------------------------------");
    }
}
