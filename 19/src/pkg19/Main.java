/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19;
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a+">"+b);
            System.out.println(a+"!="+b);
            System.out.println(a+">="+b);
        }
        
           if(b>a)
        {
            System.out.println(a+"<"+b);
            System.out.println(a+"!="+b);
            System.out.println(a+"<="+b);
        }
           
               if(b==a)
        {
            System.out.println(a+"="+b);
        }

    }
}