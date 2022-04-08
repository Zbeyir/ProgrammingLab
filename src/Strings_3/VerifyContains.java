package Strings_3;

import java.util.Scanner;

public class VerifyContains {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        scan.close();

        System.out.println(sentence.contains(word));


    }
}
/*
Instructions

this file should contain student lesson instructions

students will see these instructions in a read-only workspace tab

Steps

Use Markdown to format your instructions.

For example, here is a code block in java10


 */