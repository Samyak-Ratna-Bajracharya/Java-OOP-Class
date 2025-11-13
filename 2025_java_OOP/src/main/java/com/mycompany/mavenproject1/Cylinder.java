/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Cylinder extends Circle {
    
    private double height;
    
    public Cylinder(){}
    
    public Cylinder(double Height){
        this.height=Height;
    }
    
    public Cylinder(double Height, double Radius){
        
        super(Radius);
        this.height=Height;
    }
    
    public Cylinder(double Height, double Radius, String Color){
        
        super(Radius,Color);
        this.height=Height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getVolume(){
        double volume= this.getArea()* this.height;
        return volume;
    }
}
