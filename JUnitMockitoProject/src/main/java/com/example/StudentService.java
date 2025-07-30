package com.example;

public class StudentService {
    private final StudentRepository repo;
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }
    public String getStudentById(int id) {
        Student s = repo.findById(id);
        return s != null ? s.getName() : null;
    }
}
