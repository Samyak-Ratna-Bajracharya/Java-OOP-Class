/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Circle {
    
    private double radius;
    private String color; 
    
    public Circle(){}
    
    public Circle(double r){
        radius=r;
    }
    
    public Circle(double Radius, String Color){
        this.radius=Radius;
        this.color=Color;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public double getArea(){
        double area= 3.14159265 * (this.radius * this.radius);
        return area;
    }
    
    public void setRadius(double Radius){
        this.radius=Radius;
    }
    
    public void setColor(String Color){
        this.color=Color;
    }
    
    @Override
    public String toString(){
        String reply = " This circle is of a radius of " + this.getRadius() + "and of " + this.getColor() +"color." ;
        return reply;
        }
    
}
