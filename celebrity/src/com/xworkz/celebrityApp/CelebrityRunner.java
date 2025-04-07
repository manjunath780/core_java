package com.xworkz.celebrityApp;


import com.xworkz.celebrityApp.celebrity.Celebrity;

public class CelebrityRunner {

    public static void main(String[] args) {
        System.out.println("CelebrityRunner main started");

        Celebrity celebrity1 = new Celebrity();
        celebrity1.setId(1);
        celebrity1.setName("Shah Rukh Khan");
        celebrity1.setProfession("Actor");
        celebrity1.setAge(58);
        celebrity1.setNetWorth(7500.00);
        celebrity1.setDebutYear("1992");
        celebrity1.setMarried(true);

        int id1 = celebrity1.getId();
        String name1 = celebrity1.getName();
        String profession1 = celebrity1.getProfession();
        int age1 = celebrity1.getAge();
        double netWorth1 = celebrity1.getNetWorth();
        String debutYear1 = celebrity1.getDebutYear();
        boolean isMarried1 = celebrity1.isMarried();

        Celebrity celebrity2 = new Celebrity();
        celebrity2.setId(2);
        celebrity2.setName("Priyanka Chopra");
        celebrity2.setProfession("Actor, Singer");
        celebrity2.setAge(43);
        celebrity2.setNetWorth(500.00);
        celebrity2.setDebutYear("2003");
        celebrity2.setMarried(true);

        int id2 = celebrity2.getId();
        String name2 = celebrity2.getName();
        String profession2 = celebrity2.getProfession();
        int age2 = celebrity2.getAge();
        double netWorth2 = celebrity2.getNetWorth();
        String debutYear2 = celebrity2.getDebutYear();
        boolean isMarried2 = celebrity2.isMarried();

        Celebrity celebrity3 = new Celebrity();
        celebrity3.setId(3);
        celebrity3.setName("Virat Kohli");
        celebrity3.setProfession("Cricketer");
        celebrity3.setAge(35);
        celebrity3.setNetWorth(1000.00);
        celebrity3.setDebutYear("2008");
        celebrity3.setMarried(true);

        int id3 = celebrity3.getId();
        String name3 = celebrity3.getName();
        String profession3 = celebrity3.getProfession();
        int age3 = celebrity3.getAge();
        double netWorth3 = celebrity3.getNetWorth();
        String debutYear3 = celebrity3.getDebutYear();
        boolean isMarried3 = celebrity3.isMarried();

        Celebrity celebrity4 = new Celebrity();
        celebrity4.setId(4);
        celebrity4.setName("Deepika Padukone");
        celebrity4.setProfession("Actress");
        celebrity4.setAge(38);
        celebrity4.setNetWorth(500.00);
        celebrity4.setDebutYear("2007");
        celebrity4.setMarried(true);

        int id4 = celebrity4.getId();
        String name4 = celebrity4.getName();
        String profession4 = celebrity4.getProfession();
        int age4 = celebrity4.getAge();
        double netWorth4 = celebrity4.getNetWorth();
        String debutYear4 = celebrity4.getDebutYear();
        boolean isMarried4 = celebrity4.isMarried();

        Celebrity celebrity5 = new Celebrity();
        celebrity5.setId(5);
        celebrity5.setName("Rohit Sharma");
        celebrity5.setProfession("Cricketer");
        celebrity5.setAge(36);
        celebrity5.setNetWorth(120.00);
        celebrity5.setDebutYear("2007");
        celebrity5.setMarried(true);

        int id5 = celebrity5.getId();
        String name5 = celebrity5.getName();
        String profession5 = celebrity5.getProfession();
        int age5 = celebrity5.getAge();
        double netWorth5 = celebrity5.getNetWorth();
        String debutYear5 = celebrity5.getDebutYear();
        boolean isMarried5 = celebrity5.isMarried();

        System.out.println("Celebrity ID: " + id1);
        System.out.println("Name: " + name1);
        System.out.println("Profession: " + profession1);
        System.out.println("Age: " + age1);
        System.out.println("Net Worth: ₹" + netWorth1 + " Cr");
        System.out.println("Debut Year: " + debutYear1);
        System.out.println("Married: " + (isMarried1 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Celebrity ID: " + id2);
        System.out.println("Name: " + name2);
        System.out.println("Profession: " + profession2);
        System.out.println("Age: " + age2);
        System.out.println("Net Worth: ₹" + netWorth2 + " Cr");
        System.out.println("Debut Year: " + debutYear2);
        System.out.println("Married: " + (isMarried2 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Celebrity ID: " + id3);
        System.out.println("Name: " + name3);
        System.out.println("Profession: " + profession3);
        System.out.println("Age: " + age3);
        System.out.println("Net Worth: ₹" + netWorth3 + " Cr");
        System.out.println("Debut Year: " + debutYear3);
        System.out.println("Married: " + (isMarried3 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Celebrity ID: " + id4);
        System.out.println("Name: " + name4);
        System.out.println("Profession: " + profession4);
        System.out.println("Age: " + age4);
        System.out.println("Net Worth: ₹" + netWorth4 + " Cr");
        System.out.println("Debut Year: " + debutYear4);
        System.out.println("Married: " + (isMarried4 ? "Yes" : "No"));
        System.out.println("------------------------------");

        System.out.println("Celebrity ID: " + id5);
        System.out.println("Name: " + name5);
        System.out.println("Profession: " + profession5);
        System.out.println("Age: " + age5);
        System.out.println("Net Worth: ₹" + netWorth5 + " Cr");
        System.out.println("Debut Year: " + debutYear5);
        System.out.println("Married: " + (isMarried5 ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
