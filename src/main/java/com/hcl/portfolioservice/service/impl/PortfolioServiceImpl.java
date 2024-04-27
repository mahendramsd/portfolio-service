package com.hcl.portfolioservice.service.impl;


import com.hcl.portfolioservice.domain.Portfolio;
import com.hcl.portfolioservice.domain.repository.PortfolioRepository;
import com.hcl.portfolioservice.model.CustomerPortfolioDto;
import com.hcl.portfolioservice.model.PortfolioDto;
import com.hcl.portfolioservice.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Override
    public List<CustomerPortfolioDto> getPortfolios(String customerId) {

        List<Portfolio> portfolioByCustomerId = portfolioRepository.findByCustomerId(customerId);
        return portfolioByCustomerId.stream().map(c -> {
            CustomerPortfolioDto customerPortfolioDto = new CustomerPortfolioDto();
            customerPortfolioDto.setPortfolioId(c.getId());
            customerPortfolioDto.setCustomerName(c.getCustomerName());
            customerPortfolioDto.setPortfolioNumber(c.getPortfolioNumber());
            return customerPortfolioDto;
        }).collect(Collectors.toList());
    }

    @Override
    public PortfolioDto getPortfolio(String portfolioNumber) {
        Portfolio portfolioByPortfolioNumber = portfolioRepository.findByPortfolioNumber(portfolioNumber);

        return new PortfolioDto(
                portfolioByPortfolioNumber.getId(),
                portfolioByPortfolioNumber.getCustomerName(),
                portfolioByPortfolioNumber.getPortfolioNumber(),
                portfolioByPortfolioNumber.getPortfolioValue(),
                portfolioByPortfolioNumber.getPortfolioPerformance(),
                portfolioByPortfolioNumber.getInvestmentStrategy()
        );

    }
}
