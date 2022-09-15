package com.rousselsproject.neatwork.controller;

import com.rousselsproject.neatwork.model.MissionModel;
import com.rousselsproject.neatwork.model.ProjectModel;
import com.rousselsproject.neatwork.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MissionController {

    @Autowired
    private MissionRepository missionRepos;
    @GetMapping("/get_Missions")
    public List<MissionModel> getAllMissions(){
        return missionRepos.findAll();
    }

    @PostMapping("/postMission")
    public MissionModel postMission(@RequestBody MissionModel newMission){
        return missionRepos.save(newMission);
    }

    @DeleteMapping("/deleteMission/{idMission}")
    public Boolean deleteMission(@PathVariable(required = true) Long idMission) {
        // Access the DB and delete the mission
        return true;
    }
}
