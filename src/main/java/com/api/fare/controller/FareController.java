package com.api.fare.controller;

import com.api.fare.entity.Fare;
import com.api.fare.repository.FareRepository;
import com.api.fare.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fare")
public class FareController {

    @Autowired
    private FareService service;

    @Autowired
    private FareRepository repository;

    @RequestMapping("/getFare")
    public Fare getFare(@RequestParam(value = "flightNumber") String flightNumber
            , @RequestParam(value = "flightDate") String flightDate) {
        return service.getFare(flightNumber, flightDate);
    }
}
