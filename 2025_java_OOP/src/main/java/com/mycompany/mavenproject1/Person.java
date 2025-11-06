/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Person{
    
    //instance variable/field
    private String name="";
    
    //class variable
    private static int personCount=0;
    
    //constructor
    public Person(String Name){
        name=Name;
        
        personCount++;
    }
    
    //getter
    public String getName(){
        return name;
    }
    
    //instance method
    public void introduce(String name_){
        System.out.println("Hello, I am " + name_);
    }
    
    //class method
    public static void population(){
        System.out.println("There are " + personCount +" people here.");
    }
}
