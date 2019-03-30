package com.example.demo.service;

import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Integer> findPairByTarget(int target) {

        return courseRepository.findIntPair(target);
    }

}
