package org.analysis.wrapper;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.analysis.wrapper.dto.CoinValue;

import java.util.List;

@Data
//TODO: thing about replacing that with deserialization
public class ResponseWrapper {
    @JsonAlias("data")
    List<CoinValue> coinValueList;
}
