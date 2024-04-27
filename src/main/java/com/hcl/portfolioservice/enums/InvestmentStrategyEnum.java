package com.hcl.portfolioservice.enums;

public enum InvestmentStrategyEnum {
    SAFE("safe"),
    MODERATE("Moderate"),
    RISKY("Risky");

    private String type;

    InvestmentStrategyEnum(String type) {
        this.type = type;
    }
}
