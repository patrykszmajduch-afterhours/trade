package org.analysis.wrapper;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.analysis.wrapper.dto.Market;

import java.util.List;

@Data
public class MarketWrapper {
    @JsonAlias("data")
    List<Market> markets;

}
