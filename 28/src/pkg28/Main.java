/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28;
import java.util.Scanner;
import java.io.File;

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
  System.out.println("/home/abc.txt  : " + new File("abc.txt").length() + " bytes");
  System.out.println("/home/test.txt : " + new File("test.txt").length() + " bytes");
    }
    
}
