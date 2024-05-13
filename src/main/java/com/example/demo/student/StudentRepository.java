package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {
//SELECT * FROM student WHERE email = ?;
    @Query("SELECT s FROM Student s WHERE s.email = ?1")// zapytanie napisane w jpql
    //skoro Student to nazwa klasy do której mamy dostęp to czemu s jest z małej litery
    Optional<Student> findStudentByEmail(String email);
}
