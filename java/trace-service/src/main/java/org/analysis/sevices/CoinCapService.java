package org.analysis.sevices;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import org.analysis.dao.CoinDto;
import org.analysis.dao.CoinValue;
import org.analysis.dao.ExchangeRate;
import org.analysis.dao.ResponseWrapper;
import org.analysis.dto.ExchangeRateWrapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class CoinCapService implements IService {

    private final static String URL = "https://api.coincap.io/v2/";
    RestTemplate template = new RestTemplate();

    public List<CoinValue> fetchData() {
        ResponseEntity<ResponseWrapper> response
                = template.getForEntity(URL + "assets", ResponseWrapper.class);
        return response.getBody().getCoinValueList();
    }

    public ExchangeRate getExchangeRate(String id){
        ResponseEntity<ExchangeRateWrapper> response
                = template.getForEntity(URL + "rates/"+id, ExchangeRateWrapper.class);
        return response.getBody().getExchangeRate();
    }

    @Cacheable("COINS") //TODO: change that to call for supported crypto currency
    public List<CoinDto> getSupportedCoins(){
        return List.of(new CoinDto( new BigDecimal(36001),"BIC","bitcoin",1l),
                new CoinDto( new BigDecimal(10023),"ETH","ETHERUM",2l),
                new CoinDto(new BigDecimal(4000),"SOL","SOLE",3l),
                new CoinDto(new BigDecimal(20),"DOGE","DOGECOIN",4l));
    }
}
