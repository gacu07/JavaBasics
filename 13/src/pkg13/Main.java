/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13;
import java.util.*;

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
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        System.out.println("Area is:"+(a1*a2));
        System.out.println("Perimeter is:"+ ((a1+a2)*2));
        
    }
    
}
