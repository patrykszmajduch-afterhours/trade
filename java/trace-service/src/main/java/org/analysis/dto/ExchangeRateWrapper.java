package org.analysis.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.analysis.dao.ExchangeRate;

@Data
public class ExchangeRateWrapper {
    @JsonAlias("data")
    ExchangeRate exchangeRate;
}
