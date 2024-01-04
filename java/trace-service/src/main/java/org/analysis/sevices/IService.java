package org.analysis.sevices;

import org.analysis.dao.CoinValue;

import java.util.List;

public interface IService {
    List<CoinValue> fetchData();
}
