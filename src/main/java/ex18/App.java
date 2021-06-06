package ex18;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Farenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Farenheit.");
        System.out.print("Your choice;  ");
        char ch = sc.next().charAt(0); // needed to store choice C/F
        int temp=0,res=0;

        if(ch == 'C'){
            System.out.print("Please enter the temperature in Farenheit: ");
            temp = sc.nextInt();// input for temp
            res = (temp - 32)* 5/9; // conversion formula
            System.out.print("The Temperature in Celsius is " +res+ ".");

        }
        else if(ch == 'F') {
            System.out.print("Please enter the temperature in Farenheit: ");
            temp = sc.nextInt();// input for temp
            res = (temp - 32) * 5 / 9; // conversion formula
            System.out.print("The Temperature in Celsius is " + res + ".");
        }

        else {
            System.out.println("Wrong input!");
        }





    }
}
