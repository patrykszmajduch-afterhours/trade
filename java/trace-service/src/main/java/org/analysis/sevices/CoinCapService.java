package org.analysis.sevices;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import org.analysis.dao.CoinDto;
import org.analysis.dao.CoinValue;
import org.analysis.dao.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class CoinCapService implements IService {

    private final static String URL = "https://api.coincap.io/";
    RestTemplate template = new RestTemplate();

    public List<CoinValue> fetchData() {
        ObjectMapper mapper = new ObjectMapper();
        ResponseEntity<ResponseWrapper> response
                = template.getForEntity(URL + "v2/assets", ResponseWrapper.class);
        return response.getBody().getCoinValueList();
    }

    public List<CoinDto> getSupportedCoins(){
        return List.of(new CoinDto( new BigDecimal(36001),"BIC","BITCOIN",1l),
                new CoinDto( new BigDecimal(10023),"ETH","ETHERUM",2l),
                new CoinDto(new BigDecimal(4000),"SOL","SOLE",3l),
                new CoinDto(new BigDecimal(20),"DOGE","DOGECOIN",4l));
    }
}
