package com.perno.openmeteo.model;

import lombok.Data;

@Data
public class OpenMeteoResponse {
    private double latitude;
    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private Daily daily;
    private DailyUnits daily_units;

    @Data
    public static class DailyUnits {
        private String time;
        private String temperature_2m_max;
        private String temperature_2m_min;
    }
}
