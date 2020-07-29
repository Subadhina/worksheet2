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
public class powerofNo {
    public static void main(String[] args) {
        int n=4, p=3,sum=1;
        for(int i=0;i<p;i++)
        {
            sum = sum*n;
        }
        System.out.println("power of "+n+"*"+p+"...."+ sum);
        }
    }
    

