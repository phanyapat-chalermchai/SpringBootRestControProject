package com.phanyapat.crudRestProject.rest;

import com.phanyapat.crudRestProject.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    private  List<Student> studentList;

    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<>();

        studentList.add(new Student("Carol", "Pate"));
        studentList.add(new Student("Kristin", "Chase"));
        studentList.add(new Student("Noah", "Mcpherson"));
        studentList.add(new Student("Charles", "Wells"));
        studentList.add(new Student("Lenore", "Jordan"));
        studentList.add(new Student("Madge", "Horne"));
    }

    @GetMapping("getAll")
    public List<Student> getStudents(){
        return studentList;
    }

    @GetMapping("getById/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if (studentList.size() <= studentId || studentId < 0){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return studentList.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){

        //create a StudentErrorResponse
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        errorResponse.setStatus((HttpStatus.NOT_FOUND.value()));
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());


        //return ResponseEntity
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
