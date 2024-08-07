package com.example.oym.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@AllArgsConstructor@NoArgsConstructor@Getter@Setter@Builder
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String empname;
    private String empemail;
    private String empphone;
    private String empaddress;
    private int empage;
    private String empcity;
    private String emppost;



}
