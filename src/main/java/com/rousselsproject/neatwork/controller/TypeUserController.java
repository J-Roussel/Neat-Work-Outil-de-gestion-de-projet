package com.rousselsproject.neatwork.controller;

import com.rousselsproject.neatwork.model.TypeUserModel;
import com.rousselsproject.neatwork.model.UserModel;
import com.rousselsproject.neatwork.repository.TypeUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class TypeUserController {
    @Autowired
    private TypeUserRepository typeUserRepository;

    @GetMapping("/getUserType")
    public List<TypeUserModel> getAllUserTypes(){
        return typeUserRepository.findAll();
    }

    @PostMapping("/postUserType")
    public TypeUserModel postUserType(@RequestBody TypeUserModel newUserType){
        return typeUserRepository.save(newUserType);
    }
}
