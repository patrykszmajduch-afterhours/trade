package org.analysis.resource;

import org.analysis.dao.CoinDto;
import org.analysis.dao.CoinValue;
import org.analysis.sevices.BinanaceService;
import org.analysis.sevices.CoinCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 *
 */
@RestController
@RequestMapping("/")
public class TraceCheck {

    @Autowired
    CoinCapService coinCapService;

    @Autowired
    BinanaceService binanaceService;
    @GetMapping("/fetch")
    public List<CoinValue> getData(){
       return coinCapService.fetchData();
    }

    @GetMapping("/getCoins")
    public List<CoinDto> getSupportedCoins(){
        return coinCapService.getSupportedCoins();
    }

}
