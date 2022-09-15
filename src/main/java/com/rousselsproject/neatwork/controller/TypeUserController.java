package com.rousselsproject.neatwork.controller;

import com.rousselsproject.neatwork.model.TypeUserModel;
import com.rousselsproject.neatwork.model.UserModel;
import com.rousselsproject.neatwork.repository.TypeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeUserController {
    @Autowired
    private TypeUserRepository typeUserRepository;

    @GetMapping("/getUserTypes")
    public List<TypeUserModel> getAllUserTypes(){
        return typeUserRepository.findAll();
    }

    @PostMapping("/postUserType")
    public TypeUserModel postUserType(@RequestBody TypeUserModel newUserType){
        return typeUserRepository.save(newUserType);
    }
}
