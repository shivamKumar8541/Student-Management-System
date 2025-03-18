package com.shivam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shivam.entity.Students;
import com.shivam.service.StudentsService;

@Controller
public class StudentsController {

	@Autowired
	private StudentsService studentService;

	// Home Page
	@GetMapping("/")
	public String home() {
		return "home"; // Must match a Thymeleaf template in src/main/resources/templates/
	}

	// Display Students List
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students"; // Ensure Thymeleaf template is named "students.html"
	}

	// Show Registration Form
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("student", new Students());
		return "register";
	}

	// Handle Registration Form Submission
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute Students student, RedirectAttributes redirectAttributes) {
		studentService.saveStudent(student);
		redirectAttributes.addFlashAttribute("successMessage", "Student registered successfully!");
		return "redirect:/students"; // Redirects and keeps message for one request
	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable int id, Model model) {
	    model.addAttribute("student", studentService.getById(id));
	    return "edit_student"; // Must match the Thymeleaf file in templates
	}


	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Students student, RedirectAttributes redirectAttributes) {
		studentService.saveStudent(student);
		redirectAttributes.addFlashAttribute("successMessage", "Student updated successfully!");
		return "redirect:/students";
	}
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable int id, RedirectAttributes redirectAttributes) {
	    studentService.deleteStudentById(id);
	    redirectAttributes.addFlashAttribute("successMessage", "Student deleted successfully!");
	    return "redirect:/students";
	}



}
