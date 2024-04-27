package com.hcl.portfolioservice.dto.request;

import lombok.Data;

/**
 * @author mahendrasridayarathna
 * @created 27/04/2024 - 11:09 am
 * @project IntelliJ IDEA
 */
@Data
public class PositionRequest {

        private Long instrumentId;
        private Long portfolioId;
        private Integer units;
        private String tradeType;

}
