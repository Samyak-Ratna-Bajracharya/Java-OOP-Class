/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Circle extends GeometricObject{
    
    private double radius;
    
    public Circle(){}
    
    public Circle(double Radius){
        this.radius=Radius;
    }
    
    public Circle(double Radius, String Colour, boolean isFilled){
        super(Colour,isFilled);
        this.radius=Radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double Radius){
        this.radius=Radius;
    }
    
    @Override
    public double getArea(){
        double Area = 3.14159 *radius*radius;
        return Area;
    }
    
    @Override
    public double getPerimeter(){
        double Perimeter = 2*3.14159*radius;
        return Perimeter;
    }
    
    @Override
    public String getShape(){
        String shapeDesc="This is a Circle of a radius of " + this.radius + " and of " + this.color + "color and is ";
        if(filled=true){
            shapeDesc= shapeDesc + "filled.";
        }else if(filled=false){
            shapeDesc= shapeDesc + "not filled.";
        }else{
            shapeDesc="error";
        }
        
        return shapeDesc;
    }
    
    @Override
    public String toString(){
        
        String printToString = this.getShape() + "It's perimeter is "+ this.getPerimeter()+ " and it's area is "+ this.getArea();
        return printToString;
    }
    
}
