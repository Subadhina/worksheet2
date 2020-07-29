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
public class discount {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the amount");
    double d=obj.nextDouble();
    System.out.println("ener the disount in %");
    double ds=obj.nextDouble();
    double amopert=d/100*ds;
    System.out.println("The commision is:"+(d-amopert));
    
   }
}

