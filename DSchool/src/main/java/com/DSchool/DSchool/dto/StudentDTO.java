package com.DSchool.DSchool.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private String nic;
    private String email;
    private String password;
    private String address;
    private String contact;
    private String verified;
}
