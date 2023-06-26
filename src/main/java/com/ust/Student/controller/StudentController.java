package com.ust.Student.controller;

import com.ust.Student.entity.Student;
import com.ust.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studServ;

    @GetMapping("/all")
    public ResponseEntity<?> getAllStudents(){
        List<Student> list = studServ.getStud();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student stud){
        Student stud1 = studServ.addStud(stud);
        return ResponseEntity.ok().body(stud1);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateStudent(@RequestBody Student stud){
        Student stud1 = studServ.updStud(stud);
        if(stud1 != null){
            return ResponseEntity.ok().body(stud1);
        }
        else{
           return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id){
        Boolean res = studServ.delStud(id);
        if(res)
            return ResponseEntity.ok().body("Successfully deleted");
        else
            return ResponseEntity.badRequest().body("Delete failed");
    }



}
