package com.example.staffmanagement.course;

import com.example.staffmanagement.employee.Employee;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    @ManyToOne
    private Employee employee;

    public Course() {
    }

    public Course(int id, String name, String description, Integer employeeId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.employee = new Employee(employeeId, "",null ,"");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                '}';
    }
}
