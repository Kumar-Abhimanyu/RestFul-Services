package com.example.Restful.Model;

import com.example.Restful.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findById(int id);

    List<Student> findByName(String name);
}