package com.HostelRoomManagement;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.List;



@CrossOrigin(origins = "*")

@RestController

@RequestMapping("/api/students")

public class StudentController {



    @Autowired

    private StudentRepository studentRepository;



    @GetMapping

    public List<Student> getAllStudents() {

        return studentRepository.findAll();

    }



    @PostMapping

    public Student createStudent(@RequestBody Student student) {

        return studentRepository.save(student);

    }



    @PutMapping("/{id}")

    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {

        Student student = studentRepository.findById(id).orElseThrow();

        student.setName(studentDetails.getName());

        student.setEnrollmentNo(studentDetails.getEnrollmentNo());

        student.setGender(studentDetails.getGender());

        student.setCourse(studentDetails.getCourse());

        student.setYear(studentDetails.getYear());

        student.setContact(studentDetails.getContact());

        return studentRepository.save(student);

    }



    @DeleteMapping("/{id}")

    public void deleteStudent(@PathVariable Long id) {

        studentRepository.deleteById(id);

    }

}

