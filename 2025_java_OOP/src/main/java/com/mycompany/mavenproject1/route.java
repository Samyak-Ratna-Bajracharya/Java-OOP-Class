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

public class route {
    
    private String[] stops;
    
    public void makeRoute(String... cities){
        this.stops=cities;
    }
    
    public static void main(String[] args) {
        System.out.println("list the cities of this route ");
        Scanner take_route= new Scanner(System.in);
        String input = take_route.nextLine();
        String[] parts = input.split("[,\\s]+");
        route r=new route();
        r.makeRoute(parts);
        
    }
}
    
