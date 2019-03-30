package com.example.demo.repository;
import java.util.*;

public class CourseRepository {

    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> pair = new ArrayList<>();

    public CourseRepository() {

        for(int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        pair.add(0);
        pair.add(1);
    }

    public List<Integer> findIntPair(int target){

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
