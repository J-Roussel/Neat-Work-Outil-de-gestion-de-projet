package com.rousselsproject.neatwork.controller;

import com.rousselsproject.neatwork.model.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rousselsproject.neatwork.repository.UserRepository;


import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserRepository userRepos;

    //to see all collaborators
    @GetMapping("/getUser")
    public List<UserModel> getAllUsers(){
        return userRepos.findAll();
    }

    //To find a collaborator(user) by his or her name
    @GetMapping("/getUser/{lastName}")
    public List<UserModel> getLastNameUser(@PathVariable String lastName){
        return userRepos.findByLastNameUserIgnoreCase(lastName);
    }

    @PostMapping("/postUser")
    public UserModel postUserModel(@RequestBody UserModel newUser){
            return userRepos.save(newUser);
    }


    @DeleteMapping("/deleteUser/{idUser}")
    public Boolean deleteUser(@PathVariable(required = true) Long idUser) {
        // Access the DB and delete the user
        return true;
    }

}
