package Strings_3;

import java.util.Scanner;

public class MiddleThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        scan.close();

        if (word.length()>=5 && word.length() % 2 !=0){

            System.out.println(word.substring((word.length()-3)/2,(word.length()-3)/2+3));

  // !!!! burada benim yanlisim 3 cikardiktan sonra parantez koymamam!!!!

        } else  {

            System.out.println("invalid");
        }





    }
}
/*
Given a String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters. If the word does not meet the requirements print invalid.

fifteen ==> fte

apple ==> ppl

hey ==> invalid

java ==> invalid

whatsup ==> ats

$ ==> invalid
 */