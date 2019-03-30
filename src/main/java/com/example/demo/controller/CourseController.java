package com.example.demo.controller;

import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CourseController {

    @Autowired
    CourseService courseService = new CourseService();

    @GetMapping(path = "/", produces = "application/json")
    public HttpEntity findAllCourses(){
       // List<CourseDto> allCourses = courseService.findAllCourses();

        return new ResponseEntity<>("OK",HttpStatus.OK);
    }

    @GetMapping(path = "/{integerinput}", produces = "application/json")
    public HttpEntity<Integer> twosum(@PathVariable("integerinput") int target) {

        List<Integer> findPair = courseService.findPairByTarget(target);

        return new ResponseEntity(findPair, HttpStatus.OK);
    }
}
