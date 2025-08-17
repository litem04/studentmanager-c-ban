package com.studentmanagement;


import com.studentmanagement.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testSaveStudent() {
        Student s = new Student("Nguyen Van A", "a@gmail.com", 20);
        studentRepository.save(s);

        System.out.println("✅ Đã thêm sinh viên: " + s);
    }

    @Test
    void testFindAllStudents() {
        studentRepository.findAll().forEach(System.out::println);
    }
}
