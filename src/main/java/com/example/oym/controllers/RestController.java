package com.example.oym.controllers;

import com.example.oym.DTO.EmployeDto;
import com.example.oym.entity.Employe;
import com.example.oym.entity.RolesTypes;
import com.example.oym.services.EmpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController

public class RestController {
    private EmpService empservice;
    public RestController(EmpService empservice) {
        this.empservice = empservice;
    }

    @GetMapping("/employes")
    public List<Employe> allEmployes(){
       return this.empservice.findAll();
    }

    @GetMapping("employeId/{id}")
    public Employe findEmployeid(@PathVariable int id){
        return this.empservice.findById(id);
    }


    @GetMapping("employeName/{name}")
    public Employe findEmployename(@PathVariable String name){
        return this.empservice.findByName(name);
    }

    @PostMapping("/new/employes")
    public Employe addEmploye(@RequestBody Employe employedto){
        return this.empservice.saveEmploye(employedto);
    }

    @GetMapping("employesRole/{role}")
    public List<Employe> findEmployesRole(@PathVariable RolesTypes role){
        return this.empservice.findByRole(role);
    }
    @PutMapping("employes/update")
    public Employe updateEmploye(@RequestBody Employe employe){
        return this.empservice.saveEmploye(employe);
    }
}
