/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */

import java.util.Scanner;

public class CustomException extends Exception{

    /**
     * Creates a new instance of <code>CustomException</code> without detail
     * message.
     */
    
    int[] items = new int[10];
    Scanner scan = new Scanner(System.in);
    
    
    public CustomException() {
    }

    /**
     * Constructs an instance of <code>CustomException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public CustomException(String msg) {
        super(msg);
    }
}
