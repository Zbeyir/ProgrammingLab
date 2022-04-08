package Strings_3;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        int w = word.length();
        String result = "";

        for (int i = 4; i >=0 ; i--) {

            if (w<5){
                result = "Too short!";
            }else if (w>5){
                result = "Too long!";
            }else {
                result += word.charAt(i);
            }

        }

        System.out.println(result);

    }
}
/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

Example:

input: cat
​
output: Too short!

input: singularity
​
output: Too long!

input: apple
​
output: elppa
 */