package com.hcl.portfolioservice.model;

import com.hcl.portfolioservice.enums.InvestmentStrategyEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortfolioDto {

    private Long portfolioId;

    private String customerName;

    private String portfolioNumber;

    private String portfolioValue;

    private String portfolioPerformance;

    private InvestmentStrategyEnum investmentStrategy;

    public PortfolioDto(Long portfolioId, String customerName, String portfolioNumber, String portfolioValue,
                        String portfolioPerformance, InvestmentStrategyEnum investmentStrategy) {
        this.portfolioId = portfolioId;
        this.customerName = customerName;
        this.portfolioNumber = portfolioNumber;
        this.portfolioValue = portfolioValue;
        this.portfolioPerformance = portfolioPerformance;
        this.investmentStrategy = investmentStrategy;
    }
}
