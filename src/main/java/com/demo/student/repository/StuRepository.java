package com.demo.student.repository;

import com.demo.student.model.Student;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepository extends JpaRepository<Student,Integer> {

}
