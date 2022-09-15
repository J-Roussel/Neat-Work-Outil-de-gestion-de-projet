package com.rousselsproject.neatwork.repository;

import com.rousselsproject.neatwork.model.MissionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionModel, Integer> {
}
