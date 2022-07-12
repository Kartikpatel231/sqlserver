package com.kartik.springbootcrud.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Subject_For")
public class Subject {
    @Id
    private Long id;
    @Column(name = "subjectName")
    private List<String> subjectName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(List<String> subjectName) {
        this.subjectName = subjectName;
    }
   @OneToOne(mappedBy = "Student")
    private StudentSubject studentSubject;

}

