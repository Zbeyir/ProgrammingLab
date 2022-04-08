package Strings_3;

import java.util.Scanner;

public class GetSandwich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        int firstIndex = 0;
        int lastIndex = 0;

        firstIndex = str.indexOf("bread");
        firstIndex = firstIndex + "bread".length();

        lastIndex = str.lastIndexOf("bread");

        if (firstIndex != 0 && lastIndex!= 0 && firstIndex+lastIndex >10){
            System.out.println(str.substring(firstIndex, lastIndex));
        }else{
            System.out.println("nothing");
        }

scan.close();

    }
}
/*
A sandwich is two pieces of bread with something in between.
 Print the string that is between the first and last appearance of "bread" in the given string,
  or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread
​
output: jam

input: xxbreadjambreadyy
​
output: jam

input: xxbreadapple
​
output: nothing

input: breadbutterbread
​
output: butter
 */