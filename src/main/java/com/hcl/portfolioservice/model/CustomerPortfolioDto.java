package com.hcl.portfolioservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerPortfolioDto {

    private long portfolioId;

    private String customerName;

    private String portfolioNumber;
}
