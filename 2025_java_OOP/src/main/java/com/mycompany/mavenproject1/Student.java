/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Student extends Person {
    private String StudentID;
    private static int num_of_student=0;
    
    public Student(String name, String ID){
        super(name);
        this.StudentID=ID;
    }
    
    @Override
    public void introduce(String name_, String stID){
        System.out.println("Hello, I am a Student. My name is "+ name_ + "and my student ID is "+ stID);
    }
}
