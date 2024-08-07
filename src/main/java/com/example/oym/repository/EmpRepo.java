package com.example.oym.repository;

import com.example.oym.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpRepo extends JpaRepository<Employe, Integer> {
    Optional<Employe> findByEmpname(String name);
    Optional<Employe> findByEmp_id(int id);
}


