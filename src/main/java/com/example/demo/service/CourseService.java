package com.example.demo.service;

import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Integer> findPairByTarget(int target) {

        return courseRepository.findIntPair(target);
    }

}
