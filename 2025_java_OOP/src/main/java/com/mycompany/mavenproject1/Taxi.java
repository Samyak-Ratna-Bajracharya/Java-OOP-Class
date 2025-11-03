/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Taxi extends Vehicle {
    
    private String driverName;
    private String driverLicenseNumber;
    private double farePerKm;
    private boolean isAvailable;

    public Taxi(String Company, String Brand, String Type, 
                int Seats, Road mainroad, String StartCity, 
                int StopsNum, String NumPlate, 
                String driverName, String driverLicenseNumber, 
                double farePerKm, boolean isAvailable) {
        
        super(Company, Brand, Type, 4, mainroad, StartCity, StopsNum, NumPlate);

        this.driverName = driverName;
        this.driverLicenseNumber = driverLicenseNumber;
        this.farePerKm = farePerKm;
        this.isAvailable = isAvailable;
    }

    // ---------- Setters ----------
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public void setFarePerKm(double farePerKm) {
        this.farePerKm = farePerKm;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // ---------- Getters ----------
    public String getDriverName() {
        return driverName;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}