/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23;
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
        String str=new String(sc.nextLine());
        System.out.println(str);
       char[] haha= str.toCharArray();
       System.out.println(haha);
        for(int i=str.length();i>0;i--)
        {
            System.out.print(haha[i-1]);
        }
    }
}
    
    
/*
    import java.util.Scanner;
public class Exercise37 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
    */