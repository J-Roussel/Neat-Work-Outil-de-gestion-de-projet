package com.rousselsproject.neatwork.repository;

import com.rousselsproject.neatwork.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskModel, Integer> {
}
