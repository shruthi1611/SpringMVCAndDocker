package com.example.models;

import com.example.pojo.Student;
import com.example.pojo.Subject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shona on 26/02/16.
 */

@Component
public class StudentModelBuilder {

    public Student buildDefaultExampleStudent() {
        return new Student()
                .withId("113322")
                .withName("Expedia Tester")
                .withSubjects(getAllDefaultSubjects());
    }

    public List<Subject> getAllDefaultSubjects() {

        List<Subject> subjects = new ArrayList<Subject>();

        Subject socialSubject = new Subject()
                .withCourseId("CS101")
                .withTitle("Social Science");

        Subject physicsSubject = new Subject()
                .withCourseId("CS201")
                .withTitle("Physics");

        Subject chemistrySubject = new Subject()
                .withCourseId("CS301")
                .withTitle("Chemistry");

        Subject mathSubject = new Subject()
                .withCourseId("CS102")
                .withTitle("Mathematics");

        subjects.add(socialSubject);
        subjects.add(physicsSubject);
        subjects.add(chemistrySubject);
        subjects.add(mathSubject);

        return subjects;
    }
}
