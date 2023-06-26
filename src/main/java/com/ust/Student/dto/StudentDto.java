package com.ust.Student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class StudentDto {

    private int studId;
    private String studName;
    private int studAge;
    private String studBranch;
    private String studAddress;
}
