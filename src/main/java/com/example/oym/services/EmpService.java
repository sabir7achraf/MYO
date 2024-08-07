package com.example.oym.services;

import com.example.oym.Exception.EmployeNotFoundException;
import com.example.oym.entity.Employe;
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
       Employe employe= repo.findByEmpname(name).orElseThrow(() ->new EmployeNotFoundException("User Not found by this name "+name));
        return employe;
    }


    public Employe save(Employe employee) {
        return repo.save(employee);
    }

}



