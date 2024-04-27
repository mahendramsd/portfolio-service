package com.hcl.portfolioservice.service;

import com.hcl.portfolioservice.dto.request.PositionRequest;
import com.hcl.portfolioservice.dto.response.PositionResponse;

import java.util.List;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 11:11 am
 * @project IntelliJ IDEA
 */
public interface PositionService {
    PositionResponse createPosition(PositionRequest positionRequest);

    List<PositionResponse> getAllPositions();
}
