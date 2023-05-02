package com.example.staffmanagement.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll(Integer employeeId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByEmployeeId(employeeId).forEach(courses::add);
        return courses;
    }

    public Optional<Course> findById(Integer id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void modifyCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Course course) {
        courseRepository.delete(course);
    }
}
