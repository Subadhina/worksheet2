/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;


import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class fibonocci {
    
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int a=1;
    int b=1;
    int i=1,c;
    System.out.println(a);
    System.out.println(b);
    while(i<12)
    {
     c=a+b;
     System.out.println(c);
     a = b;
     b = c;
     i++;
    }
}
}
   
    
    

