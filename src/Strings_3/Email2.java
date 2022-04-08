package Strings_3;

import java.util.Locale;

public class Email2 {

    public static void main(String[] args) {

        String email = "nalan_meltem@hmail.com";

        String firstName =   email.substring(0 ,1).toUpperCase() + email.substring(1, email.indexOf("_")).toLowerCase()  ;

        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("_")+2).toUpperCase() +
        email.substring(email.indexOf("_")+2 , email.indexOf("@")).toLowerCase() ;

        String domain = email.substring(email.indexOf("@")+1 , email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);




    }
}
/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com

Output:
First name: Craig
Last name: Federighi
Domain: apple
 */