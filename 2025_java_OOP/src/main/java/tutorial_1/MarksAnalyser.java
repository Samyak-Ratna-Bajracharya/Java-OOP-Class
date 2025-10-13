/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial_1;

import java.util.Scanner;
/**
 *
 * @author poema
 */
public class MarksAnalyser {
    
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        
        
        int list_of_marks[] = new int[6];
        int fails = 0;
        int just_pass = 0;
        int ok_pass = 0;
        int good_pass = 0;
        int great_pass = 0;
        
        int total_marks = 0;
        
        Scanner input = new Scanner(System.in);
        
        
        for(int a=0; a<6; a++)
        {
            int marks= input.nextInt();
            total_marks += marks;
            list_of_marks[a]=marks;
        }
        
        for(int a : list_of_marks)
        {
            if(a<40){
                fails++;
            }else if(40<=a && a<=49){
                just_pass++;
            }else if(50<=a && a<=59){
                ok_pass++;
            }else if(60<=a && a<=69){
                good_pass++;
            }else if(a<=70){
                great_pass++;
            }
        }
        System.out.println("marks are below 40 (Fail)" + fails + "\nmarks from 40 to 49 (Pass)" + just_pass + "\nmarks from 50 to 59 (2:2)" + ok_pass + "\nmarks from 60 to 69 (2:1)" + good_pass + "\nmarks equal or above 70 "+ great_pass);
        
        
        System.out.println("The average of the marks is: " + (total_marks/list_of_marks.length));
    }

}
