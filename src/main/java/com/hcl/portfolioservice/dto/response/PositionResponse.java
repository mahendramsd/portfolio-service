package com.hcl.portfolioservice.dto.response;

import com.hcl.portfolioservice.domain.Position;
import lombok.Data;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 11:09 am
 * @project IntelliJ IDEA
 */
@Data
public class PositionResponse {
    private Long id;
    private Long portfolioId;
    private Long instrumentId;
    private Integer units;
    private String transactionRef;

    public PositionResponse(Position position) {
        this.id = position.getId();
        this.portfolioId = position.getPortfolio();
        this.instrumentId = position.getInstrument();
        this.units = position.getUnits();
        this.transactionRef = position.getTransactionRef();
    }
}
