package com.shivam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shivam.entity.Students;
@Service
public interface StudentsService {
    List<Students> getAllStudents();

    void saveStudent(Students student);
    
    public Students getById(int id);

	 public void deleteStudentById(int id);
}
