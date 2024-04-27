package com.hcl.portfolioservice.domain;

import com.hcl.portfolioservice.utils.TradeType;
import jakarta.persistence.*;
import lombok.Data;
import org.apache.kafka.common.protocol.types.Field;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 10:48 am
 * @project IntelliJ IDEA
 */
@Data
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

    @Column (name = "TRADE_TYPE")
    @Enumerated(EnumType.STRING)
    private TradeType tradeType;

//    @Column (name = "INSTRUMENT_ID")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Instruments instrument;
//
//    @Column (name = "PORTFOLIO_ID")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Portfolio portfolio;

    @Column (name = "INSTRUMENT_ID")
    private Long instrument;

    @Column (name = "PORTFOLIO_ID")
    private Long portfolio;


}
