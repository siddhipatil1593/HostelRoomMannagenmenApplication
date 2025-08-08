package com.HostelRoomManagement;
import jakarta.persistence.*;



@Entity

public class Student {



    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    private String name;

    private String enrollmentNo;

    private String gender;

    private String course;

    private String year;

    private String contact;



    // Constructors

    public Student() {

    }



    public Student(String name, String enrollmentNo, String gender, String course, String year, String contact) {

        this.name = name;

        this.enrollmentNo = enrollmentNo;

        this.gender = gender;

        this.course = course;

        this.year = year;

        this.contact = contact;

    }



    // Getters and Setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }



    public String getName() { return name; }

    public void setName(String name) { this.name = name; }



    public String getEnrollmentNo() { return enrollmentNo; }

    public void setEnrollmentNo(String enrollmentNo) { this.enrollmentNo = enrollmentNo; }



    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }



    public String getCourse() { return course; }

    public void setCourse(String course) { this.course = course; }



    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }



    public String getContact() { return contact; }

    public void setContact(String contact) { this.contact = contact; }

}

