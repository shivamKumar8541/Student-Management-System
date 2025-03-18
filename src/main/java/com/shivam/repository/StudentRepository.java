package com.shivam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {

}
