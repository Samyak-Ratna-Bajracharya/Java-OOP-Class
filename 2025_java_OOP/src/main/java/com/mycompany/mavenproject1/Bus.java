/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Bus extends Vehicle {
    
    private String DriverID;
    private double radioFrequency;
    private int numOfEmergencyExits;
    private double busFare;
    
    private static int num_of_bus=0;
    
    public Bus(String Company, String Brand, String Type, 
        int Seats, Road mainroad, String StartCity, 
        int StopsNum, String NumPlate,String driverID,
        double Radiofreq, int numOfEmExit, double fare){

        super(Company, Brand, Type, Seats, mainroad, StartCity, StopsNum, NumPlate);

        this.DriverID=driverID;
        this.radioFrequency=Radiofreq;
        this.numOfEmergencyExits=numOfEmExit;
        this.busFare=fare;
        
        num_of_bus ++;
    }

    
    //setters
    public void setDriverID(String driverID){
        this.DriverID=driverID;
    }
    
    public void setRadioFrequency(double radioFrequency) {
        this.radioFrequency = radioFrequency;
    }

    public void setNumOfEmergencyExits(int numOfEmergencyExits) {
        this.numOfEmergencyExits = numOfEmergencyExits;
    }

    public void setBusFare(double busFare) {
        this.busFare = busFare;
    }

    
    //getters
    public String getDriverID(){
    return DriverID;
    }
    
    public double getRadioFrequency() {
    return radioFrequency;
    }
       
    public int getNumOfEmergencyExits() {
        return numOfEmergencyExits;
    }

    public double getBusFare() {
        return busFare;
    }
     
    public static void showTotalBus() {
        System.out.println("The total number of buses is: " + num_of_bus);
    }
    
    @Override
    public void showVehicleInfo() {
        super.showVehicleInfo(); // display base info
        System.out.println("----- Bus Details -----");
        System.out.println("Bus Driver ID: " + DriverID);
        System.out.println("Radio Frequency: " + radioFrequency);
        System.out.println("Number of Emergency Exits: " + numOfEmergencyExits);
        System.out.println("Bus Fare: " + busFare);
    }
}
