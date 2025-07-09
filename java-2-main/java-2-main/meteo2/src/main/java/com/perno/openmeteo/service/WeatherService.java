package com.perno.openmeteo.service;

import com.perno.openmeteo.model.OpenMeteoResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {
    private static final String OPEN_METEO_API_URL = "https://api.open-meteo.com/v1/forecast";
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public OpenMeteoResponse getWeatherForecast(double latitude, double longitude) {
        String url = UriComponentsBuilder.fromUriString(OPEN_METEO_API_URL)
                .queryParam("latitude", latitude)
                .queryParam("longitude", longitude)
                .queryParam("daily", "temperature_2m_max,temperature_2m_min")
                .queryParam("timezone", "auto")
                .build()
                .toUriString();

        return restTemplate.getForObject(url, OpenMeteoResponse.class);
    }
}
