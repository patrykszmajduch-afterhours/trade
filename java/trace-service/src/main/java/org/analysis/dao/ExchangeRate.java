package org.analysis.dao;

import lombok.Data;

@Data
public class ExchangeRate {
    private String id;
     private    String symbol;
     private   String currencySymbol;
    private    String type;
     private   double rateUsd;
}
