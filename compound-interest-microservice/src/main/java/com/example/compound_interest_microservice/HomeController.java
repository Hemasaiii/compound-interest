package com.example.compound_interest_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
            <h1>Compound Interest Microservice</h1>
            <p>Welcome to the Compound Interest Calculator API</p>
            <h2>Usage:</h2>
            <p>GET /api/compound-interest?p={principal}&r={rate}&y={years}</p>
            <h3>Example:</h3>
            <a href="/api/compound-interest?p=1000&r=5&y=2">Calculate interest for $1000 at 5% for 2 years</a>
            <br><br>
            <strong>Parameters:</strong>
            <ul>
                <li>p: Principal amount (required)</li>
                <li>r: Annual interest rate in percent (required)</li>
                <li>y: Number of years (required)</li>
            </ul>
            """;
    }
}