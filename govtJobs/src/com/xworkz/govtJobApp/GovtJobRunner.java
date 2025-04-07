package com.xworkz.govtJobApp;
import  com.xworkz.govtJobApp.govtJobApp.GovernmentJob;
public class GovtJobRunner {

    public static void main(String[] args) {
        System.out.println("GovernmentJobRunner main started");

        GovernmentJob job1 = new GovernmentJob();
        job1.setJobId(101);
        job1.setJobTitle("Civil Services Officer");
        job1.setJobDepartment("Indian Administrative Service (IAS)");
        job1.setJobLocation("Delhi");
        job1.setJobSalary(100000.00);
        job1.setJobType("Full-Time");

        int jobId1 = job1.getJobId();
        String jobTitle1 = job1.getJobTitle();
        String jobDepartment1 = job1.getJobDepartment();
        String jobLocation1 = job1.getJobLocation();
        double jobSalary1 = job1.getJobSalary();
        String jobType1 = job1.getJobType();

        GovernmentJob job2 = new GovernmentJob();
        job2.setJobId(102);
        job2.setJobTitle("Police Constable");
        job2.setJobDepartment("Police");
        job2.setJobLocation("Mumbai");
        job2.setJobSalary(40000.00);
        job2.setJobType("Full-Time");

        int jobId2 = job2.getJobId();
        String jobTitle2 = job2.getJobTitle();
        String jobDepartment2 = job2.getJobDepartment();
        String jobLocation2 = job2.getJobLocation();
        double jobSalary2 = job2.getJobSalary();
        String jobType2 = job2.getJobType();

        GovernmentJob job3 = new GovernmentJob();
        job3.setJobId(103);
        job3.setJobTitle("Indian Navy Officer");
        job3.setJobDepartment("Indian Navy");
        job3.setJobLocation("Kochi");
        job3.setJobSalary(80000.00);
        job3.setJobType("Full-Time");

        int jobId3 = job3.getJobId();
        String jobTitle3 = job3.getJobTitle();
        String jobDepartment3 = job3.getJobDepartment();
        String jobLocation3 = job3.getJobLocation();
        double jobSalary3 = job3.getJobSalary();
        String jobType3 = job3.getJobType();

        GovernmentJob job4 = new GovernmentJob();
        job4.setJobId(104);
        job4.setJobTitle("Income Tax Officer");
        job4.setJobDepartment("Income Tax Department");
        job4.setJobLocation("Chennai");
        job4.setJobSalary(60000.00);
        job4.setJobType("Full-Time");

        int jobId4 = job4.getJobId();
        String jobTitle4 = job4.getJobTitle();
        String jobDepartment4 = job4.getJobDepartment();
        String jobLocation4 = job4.getJobLocation();
        double jobSalary4 = job4.getJobSalary();
        String jobType4 = job4.getJobType();

        GovernmentJob job5 = new GovernmentJob();
        job5.setJobId(105);
        job5.setJobTitle("Teacher (Government School)");
        job5.setJobDepartment("Education");
        job5.setJobLocation("Bangalore");
        job5.setJobSalary(50000.00);
        job5.setJobType("Full-Time");

        int jobId5 = job5.getJobId();
        String jobTitle5 = job5.getJobTitle();
        String jobDepartment5 = job5.getJobDepartment();
        String jobLocation5 = job5.getJobLocation();
        double jobSalary5 = job5.getJobSalary();
        String jobType5 = job5.getJobType();

        System.out.println("Job ID: " + jobId1);
        System.out.println("Job Title: " + jobTitle1);
        System.out.println("Job Department: " + jobDepartment1);
        System.out.println("Job Location: " + jobLocation1);
        System.out.println("Job Salary: ₹" + jobSalary1);
        System.out.println("Job Type: " + jobType1);
        System.out.println("------------------------------");

        System.out.println("Job ID: " + jobId2);
        System.out.println("Job Title: " + jobTitle2);
        System.out.println("Job Department: " + jobDepartment2);
        System.out.println("Job Location: " + jobLocation2);
        System.out.println("Job Salary: ₹" + jobSalary2);
        System.out.println("Job Type: " + jobType2);
        System.out.println("------------------------------");

        System.out.println("Job ID: " + jobId3);
        System.out.println("Job Title: " + jobTitle3);
        System.out.println("Job Department: " + jobDepartment3);
        System.out.println("Job Location: " + jobLocation3);
        System.out.println("Job Salary: ₹" + jobSalary3);
        System.out.println("Job Type: " + jobType3);
        System.out.println("------------------------------");

        System.out.println("Job ID: " + jobId4);
        System.out.println("Job Title: " + jobTitle4);
        System.out.println("Job Department: " + jobDepartment4);
        System.out.println("Job Location: " + jobLocation4);
        System.out.println("Job Salary: ₹" + jobSalary4);
        System.out.println("Job Type: " + jobType4);
        System.out.println("------------------------------");

        System.out.println("Job ID: " + jobId5);
        System.out.println("Job Title: " + jobTitle5);
        System.out.println("Job Department: " + jobDepartment5);
        System.out.println("Job Location: " + jobLocation5);
        System.out.println("Job Salary: ₹" + jobSalary5);
        System.out.println("Job Type: " + jobType5);
        System.out.println("------------------------------");
    }
}

