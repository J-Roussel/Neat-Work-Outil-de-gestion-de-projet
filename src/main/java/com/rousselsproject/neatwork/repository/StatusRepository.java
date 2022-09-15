package com.rousselsproject.neatwork.repository;

import com.rousselsproject.neatwork.model.StatusModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<StatusModel, Integer> {
}
