/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;

public class MicrowaveOven extends JFrame{
    
    public MicrowaveOven(){
        
        setLayout(new  GridLayout(1,2));
        
        JButton b1 = new JButton("food to be placed here");
        add(b1);
        
        JPanel p0=new JPanel(new BorderLayout());
        JTextField t1= new JTextField("Time to be displayed here");
        p0.add(t1,BorderLayout.NORTH);
        
        JPanel p1= new JPanel(new GridLayout(4,3));
        
        for(int i=1;i<=9;i++){
            p1.add(new JButton(""+i+""));
        }
        
        p1.add(new JButton("Start"));
        p1.add(new JButton("0"));
        p1.add(new JButton("Stop"));
        
        
        p0.add(p1);
        
        add(p0);
    }
    
    public static void main(String[] args) {
        MicrowaveOven oven = new MicrowaveOven();
        oven.setTitle(":OVEN:");
        oven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oven.setSize(600,300);
        oven.setVisible(true);
    }
}