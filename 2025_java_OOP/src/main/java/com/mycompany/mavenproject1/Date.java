/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */
public class Date {

    private int day;
    private int month;
    private int year;
    
    public Date(int DD, int MM, int YYYY){
    day = DD;
    month = MM;
    year = YYYY;
    }
    
    public int getDay(){ return day;}
    public int getMonth(){ return month;}
    public int getYear(){ return year;}

    public void setDay(int DD){this.day=DD;}
    public void setMonth(int MM){this.month=MM;}
    public void setYear(int YYYY){this.year=YYYY;}
    
    public void setDate(int DD, int MM, int YYYY){this.day=DD; this.month=MM; this.year=YYYY;}
    
    public String getDate(){String date=String.format(("$02d/$02d/$04d"),this.day, this.month, this.year); return date;}
    
    @Override
    public String toString(){String date=String.format(("$02d/$02d/$04d"),this.day, this.month, this.year); return date;}
}
