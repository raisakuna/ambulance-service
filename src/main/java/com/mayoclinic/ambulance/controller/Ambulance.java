package com.mayoclinic.ambulance.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Ambulance {

    private Long id;
    private String vehicleNumber;
    private double latitude;
    private double longitude;
    private String hospitalName;



}
