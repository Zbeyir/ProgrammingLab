package Basics_0;

import java.util.Scanner;

public class PrintVariable_4 {

    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();

        word = "Java";
        System.out.println("Today's word of the day is: " + word);
        word = "Apple";
        System.out.println("Today's word of the day is: " + word);
        word = "Testing";
        System.out.println("Today's word of the day is: " + word);
        word =  "SDET";
        System.out.println("Today's word of the day is: " + word);



    }
}

/*
Given a String variable word assume the variable has a value and use it to display the word of the day.

Ex: Input: Java

Output: Today's word of the day is: Java

Ex: Input: Apple

Output: Today's word of the day is: Apple
 */