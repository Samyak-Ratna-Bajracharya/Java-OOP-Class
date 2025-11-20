/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author poema
 */

import javax.swing.*;

public class TestGUI {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // Create a button with text OK
        JButton OKbtn = new JButton("OK");
        frame.add(OKbtn);
        
        // Create a label with text "Enter your name: "
        JLabel nameLabel = new JLabel("Enter your name: ");
        frame.add(nameLabel);
        
        // Create a text field with text "Type Name Here"
        JTextField inputName = new JTextField("Type Name Here");
        frame.add(inputName);
        
        // Create a check box with text bold
        JCheckBox boldCheckbox = new JCheckBox("Bold");
        frame.add(boldCheckbox);
        
        // Create a radio button with text red
        JRadioButton rbRed = new JRadioButton("Red");
        frame.add(rbRed);
        
        // Create a combo box with choices red, green, and blue
        JComboBox cboColor = new JComboBox(new String[]{"Red",
        "Green", "Blue"});
        frame.add(cboColor);
        
        
    
    }
}
