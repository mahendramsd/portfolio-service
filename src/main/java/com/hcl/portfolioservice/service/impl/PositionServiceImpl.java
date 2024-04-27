package com.hcl.portfolioservice.service.impl;

import com.hcl.portfolioservice.domain.Position;
import com.hcl.portfolioservice.dto.request.PositionRequest;
import com.hcl.portfolioservice.dto.response.PositionResponse;
import com.hcl.portfolioservice.repository.PositionRepository;
import com.hcl.portfolioservice.service.PositionService;
import com.hcl.portfolioservice.utils.TradeType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 11:11 am
 * @project IntelliJ IDEA
 */

@Service
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public PositionResponse createPosition(PositionRequest positionRequest) {
        Position position = new Position();
        position.setUnits(positionRequest.getUnits());
        position.setTransactionRef(UUID.randomUUID().toString());
        position.setInstrument(positionRequest.getInstrumentId());
        position.setPortfolio(positionRequest.getPortfolioId());
        position.setTradeType(TradeType.valueOf(positionRequest.getTradeType()));
        positionRepository.save(position);
        return new PositionResponse(position);
    }

    @Override
    public List<PositionResponse> getAllPositions() {
        return List.of();
    }

    @Override
    public void deletePosition(Long id) {

    }
}
