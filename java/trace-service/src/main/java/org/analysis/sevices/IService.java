package org.analysis.sevices;

import org.analysis.wrapper.dto.CoinValue;

import java.util.List;

public interface IService {
    List<CoinValue> fetchData();
}
