package com.example.task6month.controller;

import com.example.task6month.entity.Student;
import com.example.task6month.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository studentRepository;
     @GetMapping("by-name")
    public List<Student> findByName(@RequestParam String name){
        return studentRepository.findByName(name);
     }
}
