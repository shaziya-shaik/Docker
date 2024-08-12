package com.Telusko.student_App;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	@RequestMapping("/getStudents")
	public List<Student> getStudents(){
		
		return repo.findAll();
		
	}
	@RequestMapping("getStudentById/{id}")
	public Student  getStudent(@PathVariable int  id) {
		Optional<Student> student=repo.findById(id);
		return student.orElse(null);
	}
	
	@RequestMapping("/addStudent")
	public void addStudent() {
		Student s=new Student();
		s.setName("patan");
		s.setAge(23);
		repo.save(s);
		
	}


}
