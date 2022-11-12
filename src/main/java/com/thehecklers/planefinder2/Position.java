package com.thehecklers.planefinder2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    private String adshex, squawk, flightno, route;
    private int altitude, heading, speed, vertRate, selectedAltitude;
    private double lat, lon, barometer;
}
