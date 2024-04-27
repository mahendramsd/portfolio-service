package com.hcl.portfolioservice.domain;

import com.hcl.portfolioservice.enums.InvestmentStrategyEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Getter
@Setter
public class Portfolio {

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "CUSTOMER_ID")
    private String customerId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "PORTFOLIO_NO")
    private String portfolioNumber;

    @Column(name = "PORTFOLIO_VALUE")
    private String portfolioValue;

    @Column(name = "CURRENT_PERF")
    private String portfolioPerformance;

    @Column(name = "INVESTMENT_STRATEGY")
    private InvestmentStrategyEnum investmentStrategy;

}
