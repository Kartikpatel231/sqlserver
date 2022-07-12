package com.kartik.springbootcrud.conveter;

import com.kartik.springbootcrud.entity.StudentSubject;
import com.kartik.springbootcrud.modal.ModelStudent;
import org.springframework.stereotype.Component;

@Component
public class ModalConvater {
    public StudentSubject convertModalToEntity(ModelStudent modalStudent) {
        StudentSubject studentSubject = new StudentSubject();
        studentSubject.setEmail(modalStudent.getEmail());
        studentSubject.setGender(modalStudent.getGender());
        studentSubject.setId(modalStudent.getId());
        studentSubject.setName(modalStudent.getName());
      //  studentSubject.setSubject(modalStudent.getSubject());
        return studentSubject;
    }
}
