package org.analysis.resource;

import org.analysis.dto.CoinDto;
import org.analysis.dto.CoinValue;
import org.analysis.dto.ExchangeRate;
import org.analysis.sevices.BinanaceService;
import org.analysis.sevices.CoinCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<CoinValue> getData() {
        return coinCapService.fetchData();
    }
    @GetMapping("/exchange/{id}")
    public ExchangeRate getExchangeRate(@PathVariable("id") String id){
        return coinCapService.getExchangeRate(id);
    }

    @GetMapping("/getCoins")
    public List<CoinDto> getSupportedCoins(){
        return coinCapService.getSupportedCoins();
    }

}
