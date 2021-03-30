package com.example.Studentform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Studentform.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
