/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */

class ThreadA extends Thread{
    
    @Override
    public void run(){
    
        for(int i=0 ;i<30; i++){
            System.out.println("This is the first thread made by extending Thread class");
        }
        
    }
    
}

class ThreadB extends Thread{
    
    @Override
    public void run(){
    
        for(int j=0 ;j<30; j++){
            System.out.println("This is the second thread made by extending Thread class");
        }
        
    }

}

class ThreadC implements Runnable{
    
    @Override
    public void run(){
    
        for(int k=0 ;k<30; k++){
            System.out.println("This is the first thread made by implementing Runnable Interface");
        }
        
    }

}


public class ThreadImplementation {
    
    public static void main(String[] args) {
        
        ThreadA A = new ThreadA();
        ThreadB B = new ThreadB();
        
        Thread C = new Thread(new ThreadC());
        
        A.start();
        B.start();
        
        C.start();
        
    }
    
}
