package com.Registration.Repository;

import com.Registration.Entity.Counsellor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounsellorRepository extends JpaRepository<Counsellor, Integer> {
}