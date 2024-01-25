package org.analysis.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class ExchangeRateWrapper {
    @JsonAlias("data")
    ExchangeRate exchangeRate;
}
