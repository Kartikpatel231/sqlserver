package com.kartik.springbootcrud.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Subject")
public class SubjectEntity {
    @Id
    private Long subId;

    @Column(name = "subjectName")
    private String subjectName;

//    @OneToOne(mappedBy = "Student")
//    private StudentEntity studentEntity;

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}

