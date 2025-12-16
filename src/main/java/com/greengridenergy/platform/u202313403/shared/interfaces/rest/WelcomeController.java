package com.greengridenergy.platform.u202313403.shared.interfaces.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Tag(name = "greengridenergy", description = "API Endpoint configurations")
@RestController
@RequestMapping("/")
public class WelcomeController {
    @GetMapping
    @Operation(summary = "greengridenergy Logic", description = "Provides information and available endpoints of the API")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation")
    })
    public Map<String, Object> welcome() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Welcome to greengridenergy Backend API");
        response.put("status", "running");
        response.put("version", "1.0.0");

        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("API Documentation", "/swagger-ui.html");
        endpoints.put("API Docs JSON", "/v3/api-docs");
        endpoints.put("Energy Records", "/api/v1/energy-records");
        endpoints.put("Meters Endpoint", "/api/v1/meters");
        response.put("endpoints", endpoints);

        return response;
    }
}
