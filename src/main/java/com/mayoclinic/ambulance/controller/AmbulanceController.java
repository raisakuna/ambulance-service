package com.mayoclinic.ambulance.controller;

import org.springframework.web.bind.annotation.*;


// baseUrl/api/v1
@RestController
@RequestMapping("/api/v1")
public class AmbulanceController {

    @GetMapping(value="/create")
    public String getListOfAmbulance(){
        return "handling request";
    }

    @GetMapping(value="/ambulance/city")
    public String getListOfAmbulanceOfParticularCity(@RequestParam("city") String city){

        return "List of ambulance " + city ;
    }

    @PutMapping(value="/ambulance")
    public String updateAmbulance(){
        return "Update Ambulance";
    }

    @PatchMapping(value="/ambulance")
    public String updateAmbulanceAvailability(){
        return "handling request";
    }

    @PostMapping (value="/ambulance")
    public String createAmbulnace(){
        return "New Ambulance request";
    }

    @DeleteMapping (value="/ambulance")
    public String deleteMapping(){
        return "handling request";
    }
}
