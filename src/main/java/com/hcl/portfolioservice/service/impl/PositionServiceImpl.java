package com.hcl.portfolioservice.service.impl;

import com.hcl.portfolioservice.domain.Instruments;
import com.hcl.portfolioservice.domain.Portfolio;
import com.hcl.portfolioservice.domain.Position;
import com.hcl.portfolioservice.dto.request.PositionRequest;
import com.hcl.portfolioservice.dto.response.PositionResponse;
import com.hcl.portfolioservice.repository.InstrumentRepository;
import com.hcl.portfolioservice.repository.PortfolioRepository;
import com.hcl.portfolioservice.repository.PositionRepository;
import com.hcl.portfolioservice.service.PositionService;
import com.hcl.portfolioservice.utils.TradeType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 11:11 am
 * @project IntelliJ IDEA
 */

@Service
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;
    private final PortfolioRepository portfolioRepository;
    private final InstrumentRepository instrumentRepository;

    public PositionServiceImpl(PositionRepository positionRepository, PortfolioRepository portfolioRepository, InstrumentRepository instrumentRepository) {
        this.positionRepository = positionRepository;
        this.portfolioRepository = portfolioRepository;
        this.instrumentRepository = instrumentRepository;
    }

    @Override
    public PositionResponse createPosition(PositionRequest positionRequest) {
        Position position = new Position();
        position.setUnits(positionRequest.getUnits());
        position.setTransactionRef(UUID.randomUUID().toString());


        Portfolio portfolio = portfolioRepository.findById(positionRequest.getPortfolioId()).orElseThrow(() -> new RuntimeException("Portfolio not found"));
        Instruments instrument = instrumentRepository.findById(positionRequest.getInstrumentId()).orElseThrow(() -> new RuntimeException("Instrument not found"));

        position.setInstrument(instrument);
        position.setPortfolio(portfolio);
        position.setTradeType(TradeType.valueOf(positionRequest.getTradeType()));
        positionRepository.save(position);
        // Kafka publish
//        publish the message message
        return new PositionResponse(position);
    }

    @Override
    public List<PositionResponse> getAllPositions() {
        List<Position> positions = positionRepository.findAll();
        List<PositionResponse> positionResponses = positions.stream()
                .map(PositionResponse::new)
                .collect(Collectors.toList());
        return positionResponses;
    }

    @Override
    public void deletePosition(Long id) {
        positionRepository.deleteById(id);
    }
}
