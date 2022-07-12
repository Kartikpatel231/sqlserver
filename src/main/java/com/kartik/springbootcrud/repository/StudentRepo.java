package com.kartik.springbootcrud.repository;

import com.kartik.springbootcrud.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<StudentEntity,Integer> {
}
