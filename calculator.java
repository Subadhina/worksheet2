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
public class calculator {
    public static void main(String[] args) {
        int a=10,b=3;
        Scanner obj=new Scanner(System.in);
        char ch=obj.next().charAt(0);
        switch(ch)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a*b);
                break;
            default:
                System.out.println("invalid entry");
                
        
        }
    }
    
}
