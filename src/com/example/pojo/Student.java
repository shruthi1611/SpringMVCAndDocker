package com.example.pojo;

import java.util.List;

/**
 * Created by shona on 26/02/16.
 */
public class Student {

    private String studentName;
    private String studentId;
    private List<Subject> subjects;

   public Student withName(String name) {
       this.studentName = name;
       return this;
   }

    public Student withId(String id) {
        this.studentId = id;
        return this;
    }

    public Student withSubjects(List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
