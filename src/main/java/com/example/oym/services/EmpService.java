package com.example.oym.services;

import com.example.oym.DTO.EmployeDto;
import com.example.oym.Exception.EmployeNotFoundException;

import com.example.oym.entity.Employe;
import com.example.oym.entity.RolesTypes;
import com.example.oym.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;
 
    public List<Employe>findAll(){
    return repo.findAll();
    }

    public Employe findById(int id){
        return repo.findById(id).orElseThrow(() ->new EmployeNotFoundException("User Not found by this id "+id));
    }

    public Employe findByName(String name) {
    return repo.findByEmpname(name).orElseThrow(() ->new EmployeNotFoundException("User Not found by this name "+name));
    }

    public Employe saveEmploye(Employe employe){
        return repo.save(employe);
    }
    public List<Employe> findByRole(RolesTypes role){
        return repo.findByRole(role).orElseThrow(()->new EmployeNotFoundException("there is no users by this role  "+role));
    }

}



