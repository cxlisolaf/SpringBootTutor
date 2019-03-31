package com.example.demo.repository;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    private List<Integer> numbers = new ArrayList<>();


    public CourseRepository() {

        for(int i = 0; i < 5; i++) {
            numbers.add(i);
        }
    }

    public List<Integer> findIntPair(int target){

        List<Integer> pair = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {

                if (numbers.get(i) + numbers.get(j) == target) {
                    pair.add(numbers.get(i));
                    pair.add(numbers.get(j));
                    return pair;
                }
            }
        }
        return pair;
    }

}
