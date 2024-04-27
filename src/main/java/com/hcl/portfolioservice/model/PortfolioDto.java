package com.hcl.portfolioservice.model;

import com.hcl.portfolioservice.enums.InvestmentStrategyEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortfolioDto {

    String portfolio_id;

    String customerName;

    String portfolioNumber;

    String portfolioValue;

    String portfolioPerformance;

    InvestmentStrategyEnum investmentStrategy;

}
