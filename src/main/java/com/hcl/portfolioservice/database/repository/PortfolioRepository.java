package com.hcl.portfolioservice.database.repository;

import com.hcl.portfolioservice.database.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Long, Portfolio> {
}
