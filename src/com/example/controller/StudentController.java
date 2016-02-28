package com.example.controller;

import com.example.pojo.Student;
import com.example.models.StudentModelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by shona on 26/02/16.
 */
@RestController
public class StudentController {

    @Autowired
    StudentModelBuilder studentModelBuilder;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome!!";
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Student getDefaultStudentInfo() {
        return studentModelBuilder.buildDefaultExampleStudent();
    }
}
