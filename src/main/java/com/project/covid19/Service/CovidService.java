package com.project.covid19.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.covid19.Entity.Covid19;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidService {

    public Covid19 getDailyDataCovid() throws JsonProcessingException {

        final String url = "https://covid19.th-stat.com/api/open/today";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        Covid19 covid19 = objectMapper.readValue(result, Covid19.class);
        System.out.println(covid19);

        return covid19;
    }
}




