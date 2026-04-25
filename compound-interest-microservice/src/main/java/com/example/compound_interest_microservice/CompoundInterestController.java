package com.example.compound_interest_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compound-interest")
public class CompoundInterestController {

    private final InterestCalculator ciCal;

    // Constructor Injection
    public CompoundInterestController(InterestCalculator ciCal) {
        this.ciCal = ciCal;
    }

    @GetMapping
    public double calculate(
            @RequestParam double p,
            @RequestParam double r,
            @RequestParam double y) {

        return ciCal.calculate(p, r, y);
    }
}