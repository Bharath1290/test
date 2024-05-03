package com.Registration.Repository;

import com.Registration.Entity.StudentEnq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEnqRepository extends JpaRepository<StudentEnq, Integer> {
}