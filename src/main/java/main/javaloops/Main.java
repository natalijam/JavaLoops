/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.javaloops;

import java.util.Scanner;

/**
 *
 * @author cubesofficemacair
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Loops");
        
        int age = 22;
        
        if (age >= 18) {
            System.out.println("Punoletan je");
        }else {
            System.out.println("Nije punoletan");
        }
        
        System.out.println("Koliko imate godina?");
        
        Scanner in = new Scanner(System.in);
        int age2 = in.nextInt();
        
        System.out.println("Uneli ste broj: " + age2);
        
        if (age2 <= 2 && age2 >= 0) {
        System.out.println("Ti si beba");
        } else if(age2 <= 10 && age2 >= 3) {
        System.out.println("Ti si dete");
        } else if(age2 <= 17 && age2 >= 12) {
        System.out.println("Ti si tinejdžer");
        } else if( age2 >= 18) {
        System.out.println("Ti si odrasla osoba");
        } else {
        System.out.println("Nije validan broj.");
        }
    }
    
}
// 0-2 beba
// 3-10 dete
// 12-17 tinejdžer
// 18+ odrasla