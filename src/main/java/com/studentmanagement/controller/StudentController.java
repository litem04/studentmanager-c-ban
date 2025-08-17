package com.studentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.Student;
import com.studentmanagement.repository.StudentRepository;
import com.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;
	private final StudentService studentService;
	public StudentController(StudentService studentService, StudentRepository studentRepository) {
		this.studentService= studentService;
		this.studentRepository = studentRepository;
	}
	@GetMapping
	public List<Student> getallStudents(){
		return studentService.getallStudents();
	}
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable  Long id) {
		return studentService.getStudentById(id);
	}
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
	@PutMapping("/{id}")
		public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent){
		return studentRepository.findById(id).map(student ->{student.setName(updatedStudent.getName());
			student.setEmai(updatedStudent.geteEmail());
			student.setAge(updatedStudent.getAge());
			return ResponseEntity.ok(studentRepository.save(student));
		}).orElse(ResponseEntity.notFound().build());
			
		}

}
