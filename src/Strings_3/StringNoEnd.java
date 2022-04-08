package Strings_3;

import java.util.Scanner;

public class StringNoEnd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        System.out.println(word.substring(0, word.length()-1));



    }
}
/*
Given a String txt print the value without the last letter

Ex:

Input:
foo

Output:
fo

Input:
run

Output:
ru

Hint: Use substring() and length()
 */