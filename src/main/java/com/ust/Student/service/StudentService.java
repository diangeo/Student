package com.ust.Student.service;

import com.ust.Student.entity.Student;
import com.ust.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studRepo;

    public List<Student> getStud() {
        List<Student> list = studRepo.findAll();
        return list;
    }

    public Student addStud(Student stud){
       Student stud1= studRepo.save(stud);
       return stud1;
    }

    public Student updStud(Student studNew){
        Optional<Student> studOld= studRepo.findById(studNew.getStudId());
        if(studOld.isPresent()){
            Student stud1= studOld.get();
            stud1.setStudId(studNew.getStudId());
            stud1.setStudName(studNew.getStudName());
            stud1.setStudAge(studNew.getStudAge());
            stud1.setStudBranch(studNew.getStudBranch());
            stud1.setStudAddress(studNew.getStudAddress());
            studRepo.save(stud1);
            return stud1;
        }
        else
            return null;
    }

    public Boolean delStud(int stud){
        Optional<Student> studOld = studRepo.findById(stud);
        if(studOld.isPresent()){
            studRepo.delete(studOld.get());
            return true;
        }
        else{
            return false;
        }
    }


}
