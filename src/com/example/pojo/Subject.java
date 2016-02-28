package com.example.pojo;

/**
 * Created by shona on 26/02/16.
 */
public class Subject {

    private String title;
    private String courseId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }


    public Subject withTitle(String title) {
        this.title = title;
        return this;
    }

    public Subject withCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }
}
