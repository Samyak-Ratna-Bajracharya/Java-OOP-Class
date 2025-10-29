/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class vehicle {
    
    //instance variables
    
    private String company;
    private String brand;
    private String type;
    private int num_of_seats;
    private Route mainRoute;
    private String startingCity;
    private int num_of_stops;
    private String travelSubRoute;
    
    private String[] subRoute;
    
    //class variables
    private static int total_vehicles;
    
    //constructor
    public vehicle(){
        total_vehicles++;
    }
    
    //instance methods
    
    //determine subRoute
    public void detRoute(){
        subRoute = new String[num_of_stops];
        for(int a=0; a<num_of_stops; a++){
            subRoute[a]=mainRoute.getStops()[a];
            travelSubRoute= travelSubRoute + subRoute[a];
        }
        
    }
    
}
