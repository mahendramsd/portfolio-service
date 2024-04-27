package com.hcl.portfolioservice.domain;

import jakarta.persistence.*;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 10:48 am
 * @project IntelliJ IDEA
 */
@Entity
@Table(name = "position")
public class Position {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TRANSACTION_REF")
    private String transactionRef;

    @Column (name = "UNITS")
    private Integer units;
}
