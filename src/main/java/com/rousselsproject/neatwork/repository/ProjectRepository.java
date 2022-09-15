package com.rousselsproject.neatwork.repository;

import com.rousselsproject.neatwork.model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectModel, Integer> {
}
