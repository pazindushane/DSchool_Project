package com.DSchool.DSchool.controller;

import com.DSchool.DSchool.dto.StudentDTO;
import com.DSchool.DSchool.service.StudentService;
import com.DSchool.DSchool.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchUser(@PathVariable String id) {
        StudentDTO userDTO = service.searchUser(id);
        return new ResponseEntity(new StandardResponse("200", "Done", userDTO), HttpStatus.OK);
    }

}
