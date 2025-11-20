/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Movie {
    
    private String title;
    private String category;
    private Director director;
    private int numAward;
    
    public Movie(String Title, String Category, Director Dir){ this.title=Title; this.category=Category; this.director=Dir;}

    
    public String getTitle(){return this.title;}
    public String getCategory(){return this.category;}
    public Director getDirector(){return this.director;}
    
    public void setNumAward(int Awards){this.numAward=Awards;}
    public int getNumAward(){return this.numAward;}

    @Override
    public String toString(){
        String MovieDetails="The name of this movie is: " +this.title + "/n" +
                            "This movie is categorized: " + this.category +"/n"+
                            "This movie was directed by: " + this.director.getName()+ this.director.getSurname() +"/n" +
                            "This movie has won "+ this.numAward +" awards";
        return MovieDetails;}
}
