package com.example.spring.SpringProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.SpringProject.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

	List<Student> findAll();

}
