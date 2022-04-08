package Variables_1;

import java.util.Scanner;

public class SecondsConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int num = scan.nextInt();

        int hours = num/3600;
        int minutes = (num % 3600) / 60;
        int seconds = num % 3600 % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds);




    }
}
/*
Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:
"Enter seconds:"
Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
Assign values to the hours, minutes, seconds variables
Display the result.
Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */