/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;
import java.util.*;
import java.math.*;


/**
 *
 * @author Janek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Your number please:");
        Scanner sc=new Scanner(System.in);
        float a1=sc.nextFloat();
        System.out.println("Perimeter is:"+(2*a1*Math.PI));
        System.out.println("Area is:"+(a1*a1*Math.PI));
        
    }
    
}
