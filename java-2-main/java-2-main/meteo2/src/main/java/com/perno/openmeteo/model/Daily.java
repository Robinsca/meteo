package com.perno.openmeteo.model;

import lombok.Data;
import java.util.List;

@Data
public class Daily {

    private List<String> time;
    private List<Double> temperature_2m_max;
    private List<Double> temperature_2m_min;
    
}
