/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
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
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("The area of the hexagon is:"+((6 * a*a)/(4*Math.tan(Math.PI/6))));
        // TODO code application logic here
    }
    
}
