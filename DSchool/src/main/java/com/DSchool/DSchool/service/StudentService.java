package com.DSchool.DSchool.service;

import com.DSchool.DSchool.dto.StudentDTO;

import java.util.ArrayList;

public interface StudentService {
    void addUser(StudentDTO dto);

    boolean nicAlreadyExists(String nic);

    void deleteUser(String id);

    StudentDTO searchUser(String id);

    ArrayList<StudentDTO> getAllUsers();

    void updateUser(StudentDTO dto);

    void addverify(String nic);
}
