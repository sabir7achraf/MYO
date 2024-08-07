package com.example.oym.controllers;

import com.example.oym.entity.Employe;
import com.example.oym.services.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @GetMapping("employes/{id}")
    public Employe findEmployeName(@PathVariable int id){
        return this.empservice.findById(id);
    }

    @GetMapping("employes/{name}")
    public Employe findEmployeId(@PathVariable String name){
        return this.empservice.findByName(name);
    }

    @PostMapping("/new/employes")
    public Employe addEmploye(@RequestBody Employe employe){
        return this.empservice.save(employe);
    }


}
