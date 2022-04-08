package Strings_3;

import java.util.Scanner;

public class FirstAndLastLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        scan.close();

        char f = word.charAt(0);
        char l = word.charAt(word.length()-1);

        System.out.println(""+f+l);



    }
}
/*
Write a program that will print out first and last letters together.

Input: adobe

Output: ae
 */