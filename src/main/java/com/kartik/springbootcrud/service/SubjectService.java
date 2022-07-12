package com.kartik.springbootcrud.service;

import com.kartik.springbootcrud.entity.StudentSubject;
import com.kartik.springbootcrud.entity.Subject;
import com.kartik.springbootcrud.repository.StudentRepo;
import com.kartik.springbootcrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepo studentRepo;


    public List<StudentSubject> getStudentDetail() {
        List<StudentSubject> studentSubjects = new ArrayList<>();
        studentRepo.findAll().forEach(studentSubjects::add);
        return studentSubjects;
    }

    public List<Subject> getSubject() {
        List<Subject> subjects = new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(StudentSubject studentSubject) {
        studentRepo.save(studentSubject);
    }
}


/*
    public List<Subject> getSubject(){
        List<Subject> subjectList=new ArrayList<>();
    subjectRepository.findAll().forEach(subjectList::add);
    return subjectList;
    }

    public void addSubject(Subject subject ){
        subjectRepository.save(subject);
    }

    public void updateSubject(Subject subject){

        subjectRepository.save(subject);
    }

     public  void deleteSubject(Long id){
        subjectRepository.deleteById(id);
     }
    public List<StudentSubject> getstudentSubject(){
            List<StudentSubject>studentSubjectList=new ArrayList<>();
        studentRepo.findAll();
        return studentSubjectList;

    }
}
*/