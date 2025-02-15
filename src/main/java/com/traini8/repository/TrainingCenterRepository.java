package com.traini8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.traini8.model.TrainingCenter;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    // You can add query methods here (e.g., for filtering) if needed.
}