package com.hcl.portfolioservice.repository;

import com.hcl.portfolioservice.domain.Instruments;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 3:30 pm
 * @project IntelliJ IDEA
 */
public interface InstrumentRepository extends JpaRepository<Instruments, Long> {
}
