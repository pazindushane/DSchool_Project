package com.DSchool.DSchool.service.impl;

import com.DSchool.DSchool.dto.StudentDTO;
import com.DSchool.DSchool.entity.Student;
import com.DSchool.DSchool.repo.StudentRepo;
import com.DSchool.DSchool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.ui.ModelMap;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addUser(StudentDTO dto) {

    }

    @Override
    public boolean nicAlreadyExists(String nic) {
        return false;
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public StudentDTO searchUser(String id) {
        Optional<Student> customer = studentRepo.findById(id);
        if (customer.isPresent()) {
            return modelMapper.map(customer.get(), StudentDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<StudentDTO> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(StudentDTO dto) {

    }

    @Override
    public void addverify(String nic) {

    }
}
