package com.schooldesk.schooldesk.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Faculty {
    @Id
    private String facultyId;
    private String facultyName;
    private String email;
    private String subject;
    private String facultyStatus;

    public Faculty(String facultyId, String facultyName, String email, String subject, String facultyStatus) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.email = email;
        this.subject = subject;
        this.facultyStatus = facultyStatus;
    }

    public Faculty() {
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFacultyStatus() {
        return facultyStatus;
    }

    public void setFacultyStatus(String facultyStatus) {
        this.facultyStatus = facultyStatus;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId='" + facultyId + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", facultyStatus='" + facultyStatus + '\'' +
                '}';
    }
}
