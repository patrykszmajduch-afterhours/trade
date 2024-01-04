package org.analysis.dao;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CoinValue implements Serializable {
    private static final long serialVersionUID = 1L;

    String id;
    Long rank;
    String symbol;
    String name;
    BigDecimal supply;
    BigDecimal maxSupply;
    BigDecimal marketCapUsd;
    BigDecimal volumeUsd24Hr;
    BigDecimal priceUsd;
    BigDecimal changePercent24Hr;
    BigDecimal vwap24Hr;
    String explorer;
}
