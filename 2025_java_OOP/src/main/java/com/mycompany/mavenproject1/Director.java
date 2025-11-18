/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Director {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date Dob;
    
    public Director(String Name, String Surname){name=Name; surname=Surname;}
    
    public String getName(){ return this.name; }
    public String getSurname(){ return this.surname; }
    
    public void setDOB(Date DOB){this.Dob=DOB;}
    public void setNumDirectedMovie(int Movies){this.numDirectedMovie= Movies; }

    public int getNumDirectedMovie(){ return this.numDirectedMovie; }
    public Date getDOB(){ return this.Dob; }
    
    @Override
    public String toString(){ 
        
        String Desc="This Director's name is"+this.name + this.surname + 
                    "/nThis director was born in: " + this.Dob +
                    "/nThis Director Directed " + this.numDirectedMovie +" movies.";
        return Desc;}
    
}
