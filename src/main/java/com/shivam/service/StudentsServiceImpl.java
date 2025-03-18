package com.shivam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.entity.Students;
import com.shivam.repository.StudentRepository;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Students student) {
        studentRepository.save(student);
    }

    @Override
    public Students getById(int id) {
        return studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }


}
