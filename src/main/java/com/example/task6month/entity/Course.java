package com.example.task6month.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@NamedQuery(
        name = "Course.findByTitle",
        query = "SELECT c FROM Course c WHERE c.title = :title"
)
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

}
