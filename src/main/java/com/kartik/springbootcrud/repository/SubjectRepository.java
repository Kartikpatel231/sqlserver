package com.kartik.springbootcrud.repository;

import com.kartik.springbootcrud.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,Long> {

}
