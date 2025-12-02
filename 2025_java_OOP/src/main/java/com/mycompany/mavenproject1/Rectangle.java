/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Rectangle extends GeometricObject {
    
        
    private double length;
    private double width;
    
    public Rectangle(){}
    
    public Rectangle(double Length,double Width){
        this.length=Length;
        this.width=Width;
    }
    
    public Rectangle(double Length, double Width, String Colour, boolean isFilled){
        super(Colour,isFilled);
        this.length=Length;
        this.width=Width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setLength(double Length){
        this.length=Length;
    }
    
    public void setWidth(double Width){
        this.width=Width;
    }
    
    @Override
    public double getArea(){
        double Area = length*width;
        return Area;
    }
    
    @Override
    public double getPerimeter(){
        double Perimeter = 2*(length+width);
        return Perimeter;
    }
    
    @Override
    public String getShape(){
        String shapeDesc="This is a retangle of sides of " + this.length+","+this.width  + " and of " + this.color + "color and is ";
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
