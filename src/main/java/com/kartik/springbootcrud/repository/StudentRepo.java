package com.kartik.springbootcrud.repository;

import com.kartik.springbootcrud.entity.StudentSubject;
import com.kartik.springbootcrud.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<StudentSubject,Integer> {
}
