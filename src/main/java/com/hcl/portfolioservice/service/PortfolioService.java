package com.hcl.portfolioservice.service;

import com.hcl.portfolioservice.model.PortfolioDto;

import java.util.List;

public interface PortfolioService {

    List<PortfolioDto> getPortfolios(String customerId);

    PortfolioDto getPortfolio(String portfolioNumber);
}
