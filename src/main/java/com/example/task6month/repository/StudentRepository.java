package com.example.task6month.repository;

import com.example.task6month.entity.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(name = "Student.findByName")
    List<Student> findByName(String name);
    @EntityGraph(attributePaths = "courses")
    List<Student> findAll();
}
