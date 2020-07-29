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
public class distance2pts {
public static void main(String[] args) {
    int x1=5, x2=7, y1=3, y2=4;
    double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2- y1,2));
    System.out.println(distance);
}
    
}
