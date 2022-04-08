package Strings_3;

import java.util.Locale;
import java.util.Scanner;

public class FindUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = scan.nextLine().toLowerCase();
        scan.close();

        String result = "";

        if (name.equals("max payne".toLowerCase())){
            result = "User found";
        }else if (name.equals("alan wake".toLowerCase())) {
            result = "User found";
        }else{
                result = "User not found";
            }


        System.out.println("result = " + result);
        }


}
/*
Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user to enter full name. Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake", display message: "User found!". Otherwise, display message: "User not found!". Please make your search case insensitive!

Example:

Display message: Enter full name:

input: Max Payne

Display message: User found!
 */