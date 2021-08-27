package com.DSchool.DSchool.repo;

import com.DSchool.DSchool.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {
}
