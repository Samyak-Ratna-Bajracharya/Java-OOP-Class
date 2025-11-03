/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Train extends Vehicle{
    
    private String trainDriverID;
    private int numOfCarriages;
    private int numOfSeatsPerCarriage;
    private double ticketPrice;

    public Train(String Company, String Brand, String Type, 
                 int Seats, Road mainroad, String StartCity, 
                 int StopsNum, String NumPlate, 
                 String trainDriverID, int numOfCarriages, 
                 int numOfSeatsPerCarriage, double ticketPrice) {
        
        super(Company, Brand, Type, Seats, mainroad, StartCity, StopsNum, NumPlate);

        this.trainDriverID = trainDriverID;
        this.numOfCarriages = numOfCarriages;
        this.numOfSeatsPerCarriage = numOfSeatsPerCarriage;
        this.ticketPrice = ticketPrice;
    }

    // ---------- Setters ----------
    public void setTrainDriverID(String trainDriverID) {
        this.trainDriverID = trainDriverID;
    }

    public void setNumOfCarriages(int numOfCarriages) {
        this.numOfCarriages = numOfCarriages;
    }

    public void setNumOfSeatsPerCarriage(int numOfSeatsPerCarriage) {
        this.numOfSeatsPerCarriage = numOfSeatsPerCarriage;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // ---------- Getters ----------
    public String getTrainDriverID() {
        return trainDriverID;
    }

    public int getNumOfCarriages() {
        return numOfCarriages;
    }

    public int getNumOfSeatsPerCarriage() {
        return numOfSeatsPerCarriage;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}

