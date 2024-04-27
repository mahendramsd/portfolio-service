package com.hcl.portfolioservice.domain;

import com.hcl.portfolioservice.enums.InvestmentStrategyEnum;
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
    long id;

    String customerId;

    String customerName;

    String portfolioNumber;

    String portfolioValue;

    String portfolioPerformance;

    InvestmentStrategyEnum investmentStrategy;

}
