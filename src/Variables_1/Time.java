package Variables_1;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        String amOrPm = sc.next();

        System.out.println(hour + ":" + minute + ":"+ second + " " + amOrPm );





    }
}
/*
In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

Declare variables: hour, minute, second that can hold int values.
Declare amOrPm variable that can hold a String ("AM" or "PM")
Instructor will set different values to your variables
Using the variables and concatenation, print values in the format mentioned above.
 */