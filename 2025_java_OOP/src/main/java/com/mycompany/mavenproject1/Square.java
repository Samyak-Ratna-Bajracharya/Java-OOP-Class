/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Square extends GeometricObject{
        
    private double side;
    
    public Square(){}
    
    public Square(double Side){
        this.side=Side;
    }
    
    public Square(double Side, String Colour, boolean isFilled){
        super(Colour,isFilled);
        this.side=Side;
    }
    
    public double getSide(){
        return this.side;
    }
    
    public void setSide(double Side){
        this.side=Side;
    }
    
    @Override
    public double getArea(){
        double Area = side*side;
        return Area;
    }
    
    @Override
    public double getPerimeter(){
        double Perimeter = 4*side;
        return Perimeter;
    }
    
    @Override
    public String getShape(){
        String shapeDesc="This is a Square of sides of length " + this.side + " and of " + this.color + "color and is ";
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
