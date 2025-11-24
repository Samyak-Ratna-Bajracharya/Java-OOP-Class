/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */

import java.awt.FlowLayout;
import javax.swing.*;

public class LayoutManager extends JFrame{

    public LayoutManager(){
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("Middle Name"));
        add(new JTextField(8));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    
    public static void main(String[] args) {
        LayoutManager mainL= new LayoutManager();
        mainL.setTitle(":ShowFlowLayout:");
        mainL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainL.setSize(200,200);
        mainL.setVisible(true);
    }
}
