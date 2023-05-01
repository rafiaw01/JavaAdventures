
package com.mycompany.area;

import java.util.Scanner;



public class Area {

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     System.out.print("What is the Radius");
     double radius = input.nextDouble();
     
     double area = radius * radius * 3.147 ;
     
     System.out.println(" The area of the circle of radius  " +        radius + "is" + area);
     
     
        
        
        
        
    }
}
