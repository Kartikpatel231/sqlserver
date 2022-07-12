package com.kartik.springbootcrud.controller;

import com.kartik.springbootcrud.entity.StudentSubject;
import com.kartik.springbootcrud.entity.Subject;
import com.kartik.springbootcrud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;


    /*@RequestMapping("/subject")
    public List<Subject> getSubject(){
        return subjectService.getSubject();
    }*/

    @RequestMapping("/Studentsubject")
    public List<StudentSubject> getStudentDetail(){
        return subjectService.getStudentDetail();
    }
    @PostMapping("/Studentall")
    public void addSubject(@PathVariable StudentSubject studentSubject ) {
      subjectService.addSubject(studentSubject);
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