/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg33;
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
      ArrayList<String> Colors= new ArrayList<>(); 
      Colors.add("Green");
      Colors.add("Blue");
      Colors.add("Red");
      Colors.add("Black");
      
      System.out.println(Colors+"\n\n");
      
      
      Colors.set(2, "PINKPINKPINK");
     
      System.out.println(Colors+"\n");
      
      
    }
    
}
