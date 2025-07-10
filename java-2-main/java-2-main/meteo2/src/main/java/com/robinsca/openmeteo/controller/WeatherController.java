package com.robinsca.openmeteo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robinsca.openmeteo.model.OpenMeteoResponse;
import com.robinsca.openmeteo.service.WeatherService;


@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/forecast")
    public OpenMeteoResponse getForecast(@RequestParam double lat, @RequestParam double lon) {
        return weatherService.getWeatherForecast(lat, lon);
    }
}
