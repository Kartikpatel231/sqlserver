package com.kartik.springbootcrud.service;

import com.kartik.springbootcrud.conveter.ModalConverter;
import com.kartik.springbootcrud.entity.StudentEntity;
import com.kartik.springbootcrud.entity.SubjectEntity;
import com.kartik.springbootcrud.modal.StudentModel;
import com.kartik.springbootcrud.repository.StudentRepo;
import com.kartik.springbootcrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

//    @Autowired
//    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepo studentRepo;

//    @Autowired
//    private ModalConverter modalConverter;


//    public List<StudentEntity> getStudentDetail() {
//        List<StudentEntity> studentEntities = new ArrayList<>();
//        studentRepo.findAll().forEach(studentEntities::add);
//        return studentEntities;
//    }
//
//    public List<SubjectEntity> getSubject() {
//        List<SubjectEntity> subjectEntities = new ArrayList<>();
//        subjectRepository.findAll().forEach(subjectEntities::add);
//        return subjectEntities;
//    }

//    public void addSubject(StudentModel student) {
//        studentRepo.save(modalConverter.convertModalToEntity(student));
//    }

    public void addSubjectEntity(StudentEntity studentEntity) {
        studentRepo.save(studentEntity);
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