package com.hcl.portfolioservice.service.impl;


import com.hcl.portfolioservice.model.PortfolioDto;
import com.hcl.portfolioservice.service.PortfolioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {


    @Override
    public List<PortfolioDto> getPortfolios(String customerId) {
        return null;
    }

    @Override
    public PortfolioDto getPortfolio(String portfolioNumber) {
        return null;
    }
}
