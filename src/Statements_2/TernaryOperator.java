package Statements_2;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();

        System.out.println((x>=5)? x : -x);


    }
}
/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:

Display x if x is greater than or equal to 5 Display -x if x is less than 5

DO NOT USE IF STATEMENT or SWITCH CASE
 */