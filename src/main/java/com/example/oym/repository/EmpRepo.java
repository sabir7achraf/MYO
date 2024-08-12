package com.example.oym.repository;

import com.example.oym.entity.Employe;
import com.example.oym.entity.RolesTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpRepo extends JpaRepository<Employe, Integer> {
    Optional<Employe> findByEmpname(String name);
    Optional<List<Employe>> findByRole(RolesTypes role);


}


