package Statements_2;

import java.util.Scanner;

public class QuizQuestion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");
        String answer = scan.next();
        scan.close();

        switch (answer){
            case "a": case "c":
                System.out.println(answer + " is wrong");
                break;
            case "b":
                System.out.println(answer + " is correct");
                break;
            default:
                System.out.println(answer + " is not valid answer");
        }


    }
}
/*
We did not learn "equals" method from String. In order to do this task with if-else if-else statements you need to know equals method. However you can try to solve this with Switch statement easily.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
​
a
​
a is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
​
b
​
b is correct

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
​
c
​
c is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
​
z
​
z is not a valid answer
 */