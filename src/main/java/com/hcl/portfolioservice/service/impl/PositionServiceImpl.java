package com.hcl.portfolioservice.service.impl;

import com.hcl.portfolioservice.dto.request.PositionRequest;
import com.hcl.portfolioservice.dto.response.PositionResponse;
import com.hcl.portfolioservice.service.PositionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 11:11 am
 * @project IntelliJ IDEA
 */

@Service
public class PositionServiceImpl implements PositionService {


    @Override
    public PositionResponse createPosition(PositionRequest positionRequest) {
        return null;
    }

    @Override
    public List<PositionResponse> getAllPositions() {
        return List.of();
    }

    @Override
    public void deletePosition(Long id) {

    }
}
