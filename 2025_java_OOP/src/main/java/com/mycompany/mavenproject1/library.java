/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

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
    
    
    public void displayBookInfo(String book_title){
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
}
