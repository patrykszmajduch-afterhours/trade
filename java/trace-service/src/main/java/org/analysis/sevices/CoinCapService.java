package org.analysis.sevices;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.analysis.dao.CoinValue;
import org.analysis.dao.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CoinCapService implements IService {

    private final static String url = "https://api.coincap.io/";
    RestTemplate template = new RestTemplate();

    public List<CoinValue> fetchData() {
        ObjectMapper mapper = new ObjectMapper();
        ResponseEntity<ResponseWrapper> response
                = template.getForEntity(url + "v2/assets", ResponseWrapper.class);
        return response.getBody().getCoinValueList();
    }
}
