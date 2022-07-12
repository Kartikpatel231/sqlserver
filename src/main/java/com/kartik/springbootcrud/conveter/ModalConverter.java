package com.kartik.springbootcrud.conveter;

import com.kartik.springbootcrud.entity.StudentEntity;
import com.kartik.springbootcrud.entity.SubjectEntity;
import com.kartik.springbootcrud.modal.StudentModel;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ModalConverter {
    public StudentEntity convertModalToEntity(StudentModel modalStudent) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setEmail(modalStudent.getEmail());
        studentEntity.setGender(modalStudent.getGender());
        studentEntity.setId(modalStudent.getId());
        studentEntity.setName(modalStudent.getName());

        SubjectEntity subject = new SubjectEntity();
        subject.setSubjectName(modalStudent.getSubjectName());

//        studentEntity.setSubjectEntity(subject);
        studentEntity.setSubjectList(Arrays.asList(subject));
        return studentEntity;
    }
}
