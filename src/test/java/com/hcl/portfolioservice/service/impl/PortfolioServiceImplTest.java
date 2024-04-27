package com.hcl.portfolioservice.service.impl;

import com.hcl.portfolioservice.domain.Portfolio;
import com.hcl.portfolioservice.domain.repository.PortfolioRepository;
import com.hcl.portfolioservice.enums.InvestmentStrategyEnum;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PortfolioServiceImplTest {

    @Autowired
    private PortfolioServiceImpl portfolioServiceImpl;
    @MockBean
    private PortfolioRepository portfolioRepository;

    @Test
    void getPortfolios() {

        Portfolio portfolio = new Portfolio();
        portfolio.setId(1);
        portfolio.setPortfolioNumber("1");
        portfolio.setPortfolioPerformance("23.4%");
        portfolio.setPortfolioValue("$43,213");
        portfolio.setInvestmentStrategy(InvestmentStrategyEnum.MODERATE);
        portfolio.setCustomerName("User");
        portfolio.setCustomerId("1");

        List<Portfolio> portfolios = new ArrayList<>();
        portfolios.add(portfolio);
        Mockito.when(portfolioRepository.findByCustomerId(ArgumentMatchers.anyString()))
                .thenReturn(portfolios);

        portfolioServiceImpl.getPortfolios("1");
    }

    @Test
    void getPortfolio() {
        Portfolio portfolio = new Portfolio();
        portfolio.setId(1);
        portfolio.setPortfolioNumber("1");
        portfolio.setPortfolioPerformance("23.4%");
        portfolio.setPortfolioValue("$43,213");
        portfolio.setInvestmentStrategy(InvestmentStrategyEnum.MODERATE);
        portfolio.setCustomerName("User");
        portfolio.setCustomerId("1");

        Mockito.when(portfolioRepository.findByPortfolioNumber(ArgumentMatchers.anyString()))
                .thenReturn(portfolio);

        portfolioServiceImpl.getPortfolios("1");
    }
}