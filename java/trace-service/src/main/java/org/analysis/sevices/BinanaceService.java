package org.analysis.sevices;

import org.analysis.dto.CoinValue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BinanaceService implements IService{
    @Override
    public List<CoinValue> fetchData() {
        throw new RuntimeException("BinanaceService not supported!");
    }
}
