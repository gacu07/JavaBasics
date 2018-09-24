/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31;
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
        ArrayList<String> Colors=new ArrayList<>();
        Colors.add("Green");
        Colors.add("Blue");
        Colors.add("Black");
        
       //System.out.println(Colors);
      for(String element:Colors)
      {
      System.out.println(element);
      }
        
      System.out.println();
      
      Colors.add(0,"Pink");
      
       for(String element:Colors)
      {
      System.out.println(element);
      }
    }
    
}
