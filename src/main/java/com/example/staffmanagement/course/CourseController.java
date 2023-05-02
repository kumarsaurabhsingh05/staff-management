package com.example.staffmanagement.course;

import com.example.staffmanagement.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    public CourseService courseService;

    @GetMapping("/employees/{employeeId}/courses")
    public List<Course> findAll(@PathVariable Integer employeeId) {
        return courseService.findAll(employeeId);
    }

    @GetMapping("/employees/{employeeId}/courses/{id}")
    public Optional<Course> findById(@PathVariable Integer id) {
        return courseService.findById(id);
    }

    @PostMapping("/employees/{employeeId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable Integer employeeId) {
        course.setEmployee(new Employee(employeeId,"",null,""));
        courseService.addCourse(course);
    }

    @PutMapping("/employees/{employeeId}/courses/{id}")
    public void modifyCourse(@PathVariable Integer id, @RequestBody Course course, @PathVariable Integer employeeId) {
        courseService.modifyCourse(course);
    }

    @DeleteMapping("/employees/{employeeId}/courses/{id}")
    public void deleteCourse(Course course) {
        courseService.deleteCourse(course);
    }

}
