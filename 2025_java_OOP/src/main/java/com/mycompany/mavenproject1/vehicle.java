/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Vehicle {
    
    //instance variables
    
    private String company;
    private String brand;
    private String type;
    private int num_of_seats;
    private Road mainRoad;
    private String startingCity;
    private int num_of_stops;
    private String numberPlate;
    private String travelRoute="";
    private String[] route;
    
    //class variables
    private static int total_vehicles;
    
    
    // ---------- Getters ----------
    public String getCompany() {
        return company;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getNumOfSeats() {
        return num_of_seats;
    }

    public Road getMainRoad() {
        return mainRoad;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public int getNumOfStops() {
        return num_of_stops;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getTravelRoute() {
        return travelRoute;
    }

    public String[] getRoute() {
        return route;
    }

    public static int getTotalVehicles() {
        return total_vehicles;
    }

    // ---------- Setters ----------
    public void setCompany(String company) {
        this.company = company;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumOfSeats(int num_of_seats) {
        this.num_of_seats = num_of_seats;
    }

    public void setMainRoad(Road mainRoad) {
        this.mainRoad = mainRoad;
    }

    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    public void setNumOfStops(int num_of_stops) {
        this.num_of_stops = num_of_stops;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setTravelRoute(String travelRoute) {
        this.travelRoute = travelRoute;
    }

    public void setRoute(String[] route) {
        this.route = route;
    }
    
    //constructor
    public Vehicle(String Company, String Brand, String Type, int Seats, Road mainroad, String StartCity, int StopNum, String NumPlate){
        
        this.company=Company;
        this.brand=Brand;
        this.type=Type;
        this.num_of_seats=Seats;
        this.mainRoad=mainroad;
        this.startingCity=StartCity;
        this.num_of_stops=StopNum;
        this.numberPlate=NumPlate;
        
        route = new String[num_of_stops];
        for(int a=0; a<num_of_stops; a++){
            route[a]=mainRoad.getStops()[a];
            travelRoute= travelRoute + route[a] + "->";
        }
        travelRoute=travelRoute+route[0];
        total_vehicles++;
    }
    
    //class method
    public static void showTotalVehicles(){
        System.out.println("The total number of vehicles registered is: " + total_vehicles);
    }
    
    //instance method
    public void showVehicleInfo() {
        System.out.println("----- Vehicle Info -----");
        System.out.println("Owner Company: " + this.company);
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Number of seats: " + this.num_of_seats);
        System.out.println("Main Road: " + this.mainRoad);
        System.out.println("Starting City: " + this.startingCity);
        System.out.println("Route: " + travelRoute);
        System.out.println("Number of stops: " + this.num_of_stops);
        System.out.println("Number Plate: " + numberPlate);
    }        

}
