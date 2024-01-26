package org.analysis.wrapper;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.analysis.wrapper.dto.ExchangeRate;

@Data
public class ExchangeRateWrapper {
    @JsonAlias("data")
    ExchangeRate exchangeRate;
}
