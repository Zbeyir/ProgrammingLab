package Strings_3;

import java.util.Scanner;

public class PrintHalfTwice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        String tmp = "";

        for (int i = 0; i < word.length() / 2 ; i++) {

            tmp += word.valueOf(word.charAt(i));

        }

        for (int i = 0; i < word.length() / 2; i++) {

            tmp += word.valueOf(word.charAt(i));

        }

        System.out.println(tmp);






    }
}
/*
Write a program that will print out first half of the word twice.

Example:

input: java
​
output: jaja

input: unity
​
output: unun
 */