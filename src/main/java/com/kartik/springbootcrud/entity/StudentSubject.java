package com.kartik.springbootcrud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "StudentSubject")
public class StudentSubject {
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
    public Subject getSubject(){
        return subject;
    }
    public void setSubject(){
        this.subject=subject;
    }

    @Id
    @Column(name = "Student_Id")
    private int id;
    private String name;
    private String email;
    private String gender;
    @OneToOne
    private Subject subject;

}