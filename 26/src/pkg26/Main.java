/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26;
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
        String str=new String(sc.next());
        char[] a=str.toCharArray();
        System.out.print(a[0]+"=");
        int ascii=(int) a[0];
        System.out.print(ascii);
        System.out.println();
        
        
        
       
    }
    
}
