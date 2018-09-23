/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;

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
       int a1=10;
       int a2=15;
       int help;
       System.out.println("a1="+a1+" a2="+a2);
       help=a2;
       a2=a1;
       a1=help;
       System.out.println("a1="+a1+" a2="+a2);
    }
    
}
