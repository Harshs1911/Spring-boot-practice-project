package com.example.Studentform.service;

import java.util.List;

import com.example.Studentform.domain.Student;

public interface Studentservice {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentByCid(long cid);
	void deleteStudentByCid(long cid);
}
