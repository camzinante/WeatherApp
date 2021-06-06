package com.example.weatherApp.service;

import com.example.weatherApp.model.Response;
import com.example.weatherApp.repository.ZipCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

// injects dependencies
@Autowired
public ZipCodeRepo zipCodeRepo;

    public Response getForecast(String zipCode){
        String url = "http://api.openweathermap.org/data/2.5/weather?zip="+
                zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);
    }

}
