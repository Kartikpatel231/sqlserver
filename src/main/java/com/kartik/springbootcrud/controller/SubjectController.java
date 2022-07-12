package com.kartik.springbootcrud.controller;

import com.kartik.springbootcrud.entity.StudentEntity;
import com.kartik.springbootcrud.modal.StudentModel;
import com.kartik.springbootcrud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/student/get-all")
    public List<StudentEntity> getStudentDetail() {
        return subjectService.getStudentDetail();
    }

    @PostMapping("/student/save")
    public void addSubject(@RequestBody StudentEntity studentEntity) {
//    public void addSubject(@RequestBody StudentModel studentModel) {
//        subjectService.addSubject(studentModel);
        subjectService.addSubjectEntity(studentEntity);
    }


}

/*
    @RequestMapping("/subject")
    public List<Subject> getSubject(){
       return subjectService.getSubject();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/subject/")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/subject/{id}")
    public void updateSubject(@PathVariable Long id, @RequestBody Subject subject){
        subjectService.updateSubject(subject);
    }

    //@RequestMapping("/subject")
    //@DeleteMapping("/delete")
    @RequestMapping(method = RequestMethod.DELETE,value = "/subject/{id}")
    public void deleteSubject(@PathVariable Long id){
        subjectService.deleteSubject(id);
    }
    @RequestMapping("/subjects")
    public List<StudentSubject> getstudentSubject(){
        return subjectService.getstudentSubject();
    }
}
*/