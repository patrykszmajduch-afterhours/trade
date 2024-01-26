package org.analysis.wrapper.dto;

import lombok.Data;

@Data
public class Market {
    private String exchangeId;
    private String baseId;
    private String quoteId;
    private String baseSymbol;
    private String quoteSymbol;
    private String volumeUsd24Hr;
    private String priceUsd;
    private String volumePercent;
}
