package Strings_3;

import java.util.Scanner;

public class WithoutX_x {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
            System.out.println(word.substring(1));
        }
        if (word.charAt(word.length() - 1) == 'x' || word.charAt(word.length() - 1) == 'X') {
            System.out.println(word.substring(0, word.length() - 1));
        } else {
            System.out.println(word);
        }

        scan.close();

    }
}
/*
Given a string word, if the first or last chars are 'x' or 'X',
 print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX
​
output: Hi

input: apple
​
output: apple

input: xUxL
​
output: UxL

input: JavaX
​
output: Java
 */