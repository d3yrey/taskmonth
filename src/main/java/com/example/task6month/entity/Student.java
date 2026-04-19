package com.example.task6month.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@NamedQuery(
        name = "Student.findByName",
        query = "SELECT s FROM Student s WHERE s.username = :name"
)
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private int age;
    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;
}
