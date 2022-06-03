package com.api.fare.service;

import com.api.fare.entity.Fare;
import com.api.fare.repository.FareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FareService {
    @Autowired
    private FareRepository repository;

    public Fare getFare(String flightNumber, String flightDate) {
    return repository.getFareByFlightNumberAndFlightDate(flightNumber,flightDate);
    }
}
