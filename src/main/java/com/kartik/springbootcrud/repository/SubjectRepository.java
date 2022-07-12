package com.kartik.springbootcrud.repository;

import com.kartik.springbootcrud.entity.SubjectEntity;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<SubjectEntity,Long> {

}
