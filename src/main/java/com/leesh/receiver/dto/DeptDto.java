package com.leesh.receiver.dto;

import lombok.*;

import javax.servlet.annotation.HttpConstraint;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeptDto {
    int deptNo;
    String dName;
    String loc;
    String time;
}
