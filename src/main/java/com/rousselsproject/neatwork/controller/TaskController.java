package com.rousselsproject.neatwork.controller;


import com.rousselsproject.neatwork.model.TaskModel;
import com.rousselsproject.neatwork.model.UserModel;
import com.rousselsproject.neatwork.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskRepository taskRepos;
    @GetMapping("/getTasks")
    public List<TaskModel> getAllTasks(){
        return taskRepos.findAll();
    }

    @PostMapping("/postTask")
    public TaskModel postTask(@RequestBody TaskModel newTask){
        return taskRepos.save(newTask);
    }

    @DeleteMapping("/deleteTask/{idTask}")
    public Boolean deleteTask(@PathVariable(required = true) Long idTask) {
        // Access the DB and delete the task
        return true;
    }


}
