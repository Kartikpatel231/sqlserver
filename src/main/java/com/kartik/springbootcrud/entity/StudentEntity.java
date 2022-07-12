package com.kartik.springbootcrud.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
public class StudentEntity {

    @Id
    @Column(name = "Student_Id")
    private int id;
    private String name;
    private String email;
    private String gender;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id_fk")
    private List<SubjectEntity> subjectList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<SubjectEntity> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<SubjectEntity> subjectList) {
        this.subjectList = subjectList;
    }
//    @OneToOne(cascade = CascadeType.ALL)
//    private SubjectEntity subjectEntity;
//    public SubjectEntity getSubjectEntity() {
//        return subjectEntity;
//    }
//
//    public void setSubjectEntity(SubjectEntity subjectEntity) {
//        this.subjectEntity = subjectEntity;
//    }
}