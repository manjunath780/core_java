package com.xworkz.constitutionApp;


import com.xworkz.constitutionApp.constitution.Constitution;

public class ConstitutionRunner {

    public static void main(String[] args) {
        System.out.println("ConstitutionRunner main started");

        Constitution constitution1 = new Constitution();
        constitution1.setId(1);
        constitution1.setCountry("India");
        constitution1.setLanguage("Hindi, English");
        constitution1.setMainArticles("Articles on Fundamental Rights, Directive Principles of State Policy");
        constitution1.setTotalPages(395);
        constitution1.setAdoptionDate("26 January 1950");
        constitution1.setSupremeCourt("Supreme Court of India");

        int id1 = constitution1.getId();
        String country1 = constitution1.getCountry();
        String language1 = constitution1.getLanguage();
        String mainArticles1 = constitution1.getMainArticles();
        int totalPages1 = constitution1.getTotalPages();
        String adoptionDate1 = constitution1.getAdoptionDate();
        String supremeCourt1 = constitution1.getSupremeCourt();

        Constitution constitution2 = new Constitution();
        constitution2.setId(2);
        constitution2.setCountry("USA");
        constitution2.setLanguage("English");
        constitution2.setMainArticles("Articles on Bill of Rights, Federalism");
        constitution2.setTotalPages(27);
        constitution2.setAdoptionDate("17 September 1787");
        constitution2.setSupremeCourt("Supreme Court of the United States");

        int id2 = constitution2.getId();
        String country2 = constitution2.getCountry();
        String language2 = constitution2.getLanguage();
        String mainArticles2 = constitution2.getMainArticles();
        int totalPages2 = constitution2.getTotalPages();
        String adoptionDate2 = constitution2.getAdoptionDate();
        String supremeCourt2 = constitution2.getSupremeCourt();

        Constitution constitution3 = new Constitution();
        constitution3.setId(3);
        constitution3.setCountry("Australia");
        constitution3.setLanguage("English");
        constitution3.setMainArticles("Articles on Federalism, Judicial Review");
        constitution3.setTotalPages(8);
        constitution3.setAdoptionDate("1 January 1901");
        constitution3.setSupremeCourt("High Court of Australia");

        int id3 = constitution3.getId();
        String country3 = constitution3.getCountry();
        String language3 = constitution3.getLanguage();
        String mainArticles3 = constitution3.getMainArticles();
        int totalPages3 = constitution3.getTotalPages();
        String adoptionDate3 = constitution3.getAdoptionDate();
        String supremeCourt3 = constitution3.getSupremeCourt();

        Constitution constitution4 = new Constitution();
        constitution4.setId(4);
        constitution4.setCountry("Germany");
        constitution4.setLanguage("German");
        constitution4.setMainArticles("Articles on Fundamental Rights, Constitutional Court");
        constitution4.setTotalPages(146);
        constitution4.setAdoptionDate("23 May 1949");
        constitution4.setSupremeCourt("Federal Constitutional Court");

        int id4 = constitution4.getId();
        String country4 = constitution4.getCountry();
        String language4 = constitution4.getLanguage();
        String mainArticles4 = constitution4.getMainArticles();
        int totalPages4 = constitution4.getTotalPages();
        String adoptionDate4 = constitution4.getAdoptionDate();
        String supremeCourt4 = constitution4.getSupremeCourt();

        Constitution constitution5 = new Constitution();
        constitution5.setId(5);
        constitution5.setCountry("France");
        constitution5.setLanguage("French");
        constitution5.setMainArticles("Articles on Liberties, Rights of Citizens");
        constitution5.setTotalPages(92);
        constitution5.setAdoptionDate("4 October 1958");
        constitution5.setSupremeCourt("Council of State");

        int id5 = constitution5.getId();
        String country5 = constitution5.getCountry();
        String language5 = constitution5.getLanguage();
        String mainArticles5 = constitution5.getMainArticles();
        int totalPages5 = constitution5.getTotalPages();
        String adoptionDate5 = constitution5.getAdoptionDate();
        String supremeCourt5 = constitution5.getSupremeCourt();

        System.out.println("Constitution ID: " + id1);
        System.out.println("Country: " + country1);
        System.out.println("Language: " + language1);
        System.out.println("Main Articles: " + mainArticles1);
        System.out.println("Total Pages: " + totalPages1);
        System.out.println("Adoption Date: " + adoptionDate1);
        System.out.println("Supreme Court: " + supremeCourt1);
        System.out.println("------------------------------");

        System.out.println("Constitution ID: " + id2);
        System.out.println("Country: " + country2);
        System.out.println("Language: " + language2);
        System.out.println("Main Articles: " + mainArticles2);
        System.out.println("Total Pages: " + totalPages2);
        System.out.println("Adoption Date: " + adoptionDate2);
        System.out.println("Supreme Court: " + supremeCourt2);
        System.out.println("------------------------------");

        System.out.println("Constitution ID: " + id3);
        System.out.println("Country: " + country3);
        System.out.println("Language: " + language3);
        System.out.println("Main Articles: " + mainArticles3);
        System.out.println("Total Pages: " + totalPages3);
        System.out.println("Adoption Date: " + adoptionDate3);
        System.out.println("Supreme Court: " + supremeCourt3);
        System.out.println("------------------------------");

        System.out.println("Constitution ID: " + id4);
        System.out.println("Country: " + country4);
        System.out.println("Language: " + language4);
        System.out.println("Main Articles: " + mainArticles4);
        System.out.println("Total Pages: " + totalPages4);
        System.out.println("Adoption Date: " + adoptionDate4);
        System.out.println("Supreme Court: " + supremeCourt4);
        System.out.println("------------------------------");

        System.out.println("Constitution ID: " + id5);
        System.out.println("Country: " + country5);
        System.out.println("Language: " + language5);
        System.out.println("Main Articles: " + mainArticles5);
        System.out.println("Total Pages: " + totalPages5);
        System.out.println("Adoption Date: " + adoptionDate5);
        System.out.println("Supreme Court: " + supremeCourt5);
        System.out.println("------------------------------");
    }
}
