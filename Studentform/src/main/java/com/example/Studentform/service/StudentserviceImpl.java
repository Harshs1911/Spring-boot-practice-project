package com.example.Studentform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Studentform.domain.Student;
import com.example.Studentform.repository.StudentRepository;
import com.sun.el.stream.Optional;

@Service
public class StudentserviceImpl implements Studentservice {

	@Autowired
	private StudentRepository StudentRepository;

	@Override
	public List<Student> getAllStudents() {
		return StudentRepository.findAll();

	}

	@Override
	public void saveStudent(Student student) {
		this.StudentRepository.save(student);

	}

	@Override
	public Student getStudentByCid(long Cid) {
		java.util.Optional<Student> optional =StudentRepository.findById(Cid);
		Student student = null;
			if (optional.isPresent()) {
				student = optional.get();
				}else {
					throw new RuntimeException("Student not found for cid :: " + Cid);
				}
			return student;
		
		}

	@Override
	public void deleteStudentByCid(long cid) {
		this.deleteStudentByCid(cid);
	}
	

}

		