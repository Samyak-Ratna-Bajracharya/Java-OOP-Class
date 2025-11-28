/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public abstract class GeometricObject {
    private boolean filled;
    private String color;
    
    public GeometricObject(){};
    
    public GeometricObject(String Color, boolean Fill){
        
        this.color = Color;
        this.filled = Fill;
        
    };
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String Color){
        this.color=Color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean fill){
        this.filled=fill;
    }
    
    
    abstract double getPerimeter();
    
    abstract double getArea();
    
    abstract String getShape();
    
    @Override
    public String toString(){
        String print="this geometric object is of color: " + color + "and is ";
        if(filled==true){print = print + "filled";}else if(filled==false){print = print + "not filled";}
        else{print="ERROR";}
        return print;
    }
    
}
