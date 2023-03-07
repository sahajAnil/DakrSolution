package com.dakrsolution.student.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dakrsolution.student.model.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {



}