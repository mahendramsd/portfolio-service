package com.hcl.portfolioservice.controller;

import com.hcl.portfolioservice.dto.request.PositionRequest;
import com.hcl.portfolioservice.dto.response.PositionResponse;
import com.hcl.portfolioservice.service.PositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 10:47 am
 * @project IntelliJ IDEA
 */
@RestController
@RequestMapping("/position")
public class PositionController {

    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @PostMapping
    public ResponseEntity<PositionResponse> createPosition(@RequestBody PositionRequest positionRequest) {
        return ResponseEntity.ok(positionService.createPosition(positionRequest));
    }


    @GetMapping
    public ResponseEntity<List<PositionResponse>> getAllPositions() {
        return ResponseEntity.ok(positionService.getAllPositions());
    }

}
