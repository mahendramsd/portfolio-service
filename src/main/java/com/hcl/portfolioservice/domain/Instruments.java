package com.hcl.portfolioservice.domain;

import com.hcl.portfolioservice.utils.InstrumentType;
import jakarta.persistence.*;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 10:48 am
 * @project IntelliJ IDEA
 */
@Entity
@Table(name = "instruments")
public class Instruments {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "INSTRUMENT_VALUE")
    private Integer instrumentValue;

    @Column(name = "INSTRUMENT_TYPE")
    @Enumerated(EnumType.STRING)
    private InstrumentType instrumentType;


}
