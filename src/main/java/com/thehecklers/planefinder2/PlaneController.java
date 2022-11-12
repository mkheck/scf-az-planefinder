package com.thehecklers.planefinder2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PlaneController {
    private final PlaneFinderService pfService;

    public PlaneController(PlaneFinderService pfService) {
        this.pfService = pfService;
    }

    @GetMapping("/aircraft")
    public Iterable<AircraftPosition> getCurrentAircraft() throws IOException {
        return pfService.getAircraft();
    }

}
