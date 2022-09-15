package com.rousselsproject.neatwork.repository;

import com.rousselsproject.neatwork.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<UserModel, Integer> {

    //To find collaborator by his or her last name
    List<UserModel> findByLastNameUserIgnoreCase(String wantedLastName);



}
