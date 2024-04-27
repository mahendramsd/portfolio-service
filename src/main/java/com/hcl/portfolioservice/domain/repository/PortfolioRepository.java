package com.hcl.portfolioservice.domain.repository;

import com.hcl.portfolioservice.domain.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findByCustomerId(String customerId);

    Portfolio findByPortfolioNumber(String portfolioNumber);
}
