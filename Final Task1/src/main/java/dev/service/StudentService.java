package dev.service;

import dev.domain.Student;
import dev.domain.User;
import dev.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return (Student) studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {

        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {

        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {

        studentRepository.deleteById(id);
    }

    public void create(User user) {
    }
}
