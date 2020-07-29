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
public class cgpa {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double a[]=new double[10];
        double b[]=new double[10];
        double s=0,csum=0;
        int i;
        System.out.println("Enter the no of subjects");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Ener the grade and credit for"+(i+1)+"subject");
            a[i]=obj.nextDouble();
            b[i]=obj.nextDouble();
            s=s+a[i]+b[i];
            csum=csum+b[i];
        }
        System.out.println("CGPA----"+ (s/csum));
        }
        
    }
    
    

