package com.hcl.portfolioservice.repository;

import com.hcl.portfolioservice.domain.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 12:25 pm
 * @project IntelliJ IDEA
 */

@Repository
public interface PositionRepository extends JpaRepository<Position, Long>{

}
