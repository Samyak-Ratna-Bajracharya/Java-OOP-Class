/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */

import java.util.Scanner;

public class Road {
    
    //instance variable/property
    private String[] stops;
    
    //class variable/property
    private static int totalRoutes=0;
    
    //instance method
    public void editRoad(String... cities){
        stops=cities;
    }
    
    //instance method
    public void editRoadManually() {
        System.out.println("list the cities of this route ");
        Scanner take_route= new Scanner(System.in);
        String input = take_route.nextLine();
        if (input.trim().isEmpty()) {
            System.out.println("No cities entered.");
        }else{
        stops = input.split("[,\\s]+");
        }
    }
    
    //instance method
    public void showRoad(){
        
        String printStr="";
        
        for(String stop: stops){
            printStr= printStr+ stop + " -> ";
        }
        printStr=printStr + stops[0];
        
        System.out.println("This Route goes: " + printStr);
    }
    
    //class method
    public static void showTotalRoads(){
        System.out.println("The number of total routes determined by the organization so far is: "+ totalRoutes);
    }
    
    //constructor
    public Road(String... list) {
        stops=list;
        totalRoutes++;
    }
    
    //getter
    public String[] getStops(){
        return stops;
    }
}
    
