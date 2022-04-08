package Variables_1;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class SchoolGrades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String sub1 = scan.next();
        double sub1Score = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String sub2 = scan.next();
        double sub2Score = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String sub3 = scan.next();
        double sub3Score = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String sub4 = scan.next();
        double sub4Score = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String sub5 = scan.next();
        double sub5Score = scan.nextDouble();
        scan.close();

        System.out.println("Summary: " +sub1 + " - " + sub1Score +  ", " +
                sub2 + " - " + sub2Score +  ", " + sub3 + " - " + sub3Score +
                ", " + sub4 + " - " + sub4Score +  ", " + sub5 + " - " + sub5Score );

        double average = (sub1Score + sub2Score + sub3Score + sub4Score + sub5Score) / 5 ;

        System.out.println("Your average score is:" + average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");




    }
}
/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4
​
Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */