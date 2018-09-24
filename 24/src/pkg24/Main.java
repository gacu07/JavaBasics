/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24;
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
        counter(str);

}
public static void counter(String x){
char[] tab=x.toCharArray();
	int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(tab[i])){
				letter ++ ;
			}
			else if(Character.isDigit(tab[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(tab[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
                System.out.println("The string is:"+(x));
                System.out.println("length: "+(x.length()));
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
			}



}
    

