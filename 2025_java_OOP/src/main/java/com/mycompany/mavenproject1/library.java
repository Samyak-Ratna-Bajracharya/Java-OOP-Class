/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
/**
 *
 * @author poema
 */
public class library {
        
    //instance variables
    private String title;
    private String author;
    private boolean is_borrowed;
    
    //class variables
    private static int total_books;
    private static int borrowed_books;
    
    //instance objects/methods
    public void borrow_books(){
    
        if(is_borrowed){
            System.out.println("The book is already borrowed.");
        }else{
            is_borrowed=true;
            borrowed_books++;
            System.out.println(title+" has now been borrowed.");
        }
    }
    
    
    public void return_books(){
        if(is_borrowed = false){
            System.out.println("The book is in the system already.");
        }else{
            is_borrowed=false;
            borrowed_books--;
            System.out.println(title+" has now been returned.");
        }
    }
    
    
    public void displayBookInfo(){
        System.out.println("TITLE: "+ title);
        System.out.println("AUTHOR: "+ author);
        System.out.println("BORROWED STATUS: "+ is_borrowed);
        
    }
    
    //class methods
    public static void displayLibraryStats(){
        System.out.println("Total books: " + total_books);
        System.out.println("Borrowed books: " + borrowed_books);
    }
    
    //constructor
    public library(String book_title, String book_author ){
        title = book_title;
        author = book_author;
        is_borrowed = false;
        
        total_books ++;
                
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the library");
        
        library book1=new library("Chess openings", "Levy Rosman");
        library book2=new library("Coding in java 101", "Anon");
        library book3=new library("Pschology for beginners", "Anakin Skywalker");
        
        book1.displayBookInfo();        
        book1.borrow_books();
        displayLibraryStats();
        book2.borrow_books();
        displayLibraryStats();
        book3.borrow_books();
        displayLibraryStats();
        book1.return_books();
        displayLibraryStats();
        book2.return_books();
        book3.return_books();
        displayLibraryStats();
        
        
    }
}
