package Statements_2;

import java.util.Scanner;

public class ConsoleMenu {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("------------------");
        int choise = scan.nextInt() ;
        scan.close();

        String result = "";

        if (choise == 1){
            result =  "user selected 1";
        }else if (choise == 2){
            result = "user selected 2";
        }else if (choise == 3){
            result = "user selected 3";
        }





        System.out.println("result = " + result);

    }
}
/*
A console menu is basically a text menu. After it is outputted to the console a user input is captured. Then the program decides what to do according to the user input (what the user selected).

This is done using separate if statements(without else) or branched if statements.

Uur console menu has 3 items called "options"

Flow:

Prints:
---------------
select an option:
1) option 1
2) option 2
3) option 3
---------------

if choice is 1
print:
user selected 1
​
if choice is 2
print:
user selected 2
​
if choice is 3
print:
user selected 3
 */