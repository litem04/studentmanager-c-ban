	package com.studentmanagement.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.stereotype.Service;

import com.studentmanagement.Student;
import com.studentmanagement.repository.StudentRepository;
@Service
public class StudentService {
	private final StudentRepository studentRepository;
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository= studentRepository;
	}
	public List<Student> getallStudents(){
		return studentRepository.findAll();
	}

	public Student getStudentById(Long id){
		return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
