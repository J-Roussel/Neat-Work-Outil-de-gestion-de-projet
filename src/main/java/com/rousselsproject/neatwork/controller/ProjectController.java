package com.rousselsproject.neatwork.controller;

import com.rousselsproject.neatwork.model.ProjectModel;
import com.rousselsproject.neatwork.model.TaskModel;
import com.rousselsproject.neatwork.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepos;
    @GetMapping("/getProjects")
    public List<ProjectModel> getAllProjects(){
        return projectRepos.findAll();
    }

    @PostMapping("/postProject")
    public ProjectModel postProject(@RequestBody ProjectModel newProject){
        return projectRepos.save(newProject);
    }

    @DeleteMapping("/deleteProject/{idProject}")
    public Boolean deleteProject(@PathVariable(required = true) Long idProject) {
        // Access the DB and delete the project
        return true;
    }

}
