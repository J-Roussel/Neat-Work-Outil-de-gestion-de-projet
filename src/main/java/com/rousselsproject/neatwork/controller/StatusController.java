package com.rousselsproject.neatwork.controller;

import com.rousselsproject.neatwork.model.StatusModel;
import com.rousselsproject.neatwork.model.TaskModel;
import com.rousselsproject.neatwork.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatusController {
    @Autowired
    private StatusRepository statusRepos;
    @GetMapping("/getStatus")
    public List<StatusModel> getAllStatus(){
        return statusRepos.findAll();
    }

    @PostMapping("/postStatus")
    public StatusModel postStatus(@RequestBody StatusModel newTaskStatus){
        return statusRepos.save(newTaskStatus);
    }



}
