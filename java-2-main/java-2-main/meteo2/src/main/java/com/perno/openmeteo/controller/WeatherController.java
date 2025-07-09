package com.perno.openmeteo.controller;

import com.perno.openmeteo.model.OpenMeteoResponse;
import com.perno.openmeteo.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
