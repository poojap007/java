package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class StudentServiceTest {
    @Test
    void testStudentById() {
        StudentRepository repo = mock(StudentRepository.class);
        Student s = new Student(1, "John");
        when(repo.findById(1)).thenReturn(s);
        StudentService service = new StudentService(repo);
        assertEquals("John", service.getStudentById(1));
    }
}
