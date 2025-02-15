package com.traini8.controller;
import com.traini8.model.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;
import java.time.Instant;
import java.util.List;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TrainingCenter createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        // Ignore any incoming createdOn value and set it to current epoch time
        trainingCenter.setCreatedOn(Instant.now().toEpochMilli());
        return trainingCenterRepository.save(trainingCenter);
    }

    @GetMapping
    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}