package com.hcl.portfolioservice.service;

import com.hcl.portfolioservice.model.CustomerPortfolioDto;
import com.hcl.portfolioservice.model.PortfolioDto;

import java.util.List;

public interface PortfolioService {

    List<CustomerPortfolioDto> getPortfolios(String customerId);

    PortfolioDto getPortfolio(String portfolioNumber);
}
