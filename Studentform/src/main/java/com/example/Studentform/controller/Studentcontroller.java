package com.example.Studentform.controller;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Studentform.domain.Student;
import com.example.Studentform.service.Studentservice;

@Controller
public class Studentcontroller {
    
	@Autowired
	private Studentservice studentService;
	
	

	//display list of Student
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("ListStudenttble", studentService.getAllStudents());
		return "index";

	}
	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
	//create model attribute to bind form data		
		Student student = new Student();
		model.addAttribute("student", student);
		return "New_student";
	}
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		//	save Student to database
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	
	@GetMapping("/showNewFormUpdate/{Cid}")
	
	public String showNewFormUpdate(@PathVariable (value = "Cid")long cid, Model model) {
		
		// get student from the service
		Student student = studentService.getStudentByCid(cid);
		
		//set student as a model attribute to pre-populate the form
		model.addAttribute("student", studentService.getStudentByCid(cid));
		return "update_student";
		
	}
	@GetMapping("/deleteStudent/Cid}")
	public String deleteStudent(@PathVariable int cid) {
		
//		call delete studentService method
		this.studentService.deleteStudentByCid(cid);
		return "redirect:/";
	}
		
	
}
 