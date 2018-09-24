/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg32;
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
        
        Scanner sc=new Scanner(System.in);
      
        int a=sc.nextInt();
      
        // TODO code application logic here
        ArrayList<String> Colors=new ArrayList<>();
        Colors.add("Green");
        Colors.add("Blue");
        Colors.add("Black");
        
        String helper=Colors.get(a);
        System.out.println(helper);
    }
    
}
