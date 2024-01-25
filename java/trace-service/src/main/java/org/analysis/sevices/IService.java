package org.analysis.sevices;

import org.analysis.dto.CoinValue;

import java.util.List;

public interface IService {
    List<CoinValue> fetchData();
}
