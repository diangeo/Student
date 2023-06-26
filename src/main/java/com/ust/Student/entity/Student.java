package com.ust.Student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {

    @Id
    @Column(name="studId")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studId;

    @Column(name="studName")
    private String studName;

    @Column(name = "studAge")
    private int studAge;

    @Column(name="studBranch")
    private String studBranch;

    @Column(name="studAddress")
    private String studAddress;

}
