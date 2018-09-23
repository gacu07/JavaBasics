/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
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
        System.out.println("Podaj liczbe");
        Scanner scan=new Scanner(System.in);
        int a1=scan.nextInt();
        System.out.println("Podaj druga liczbe");
        int a2=scan.nextInt();
        System.out.println("Suma twoich liczb to:" + (a1+a2));

    }
    
}
