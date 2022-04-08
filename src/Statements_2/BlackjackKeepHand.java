package Statements_2;

import java.util.Scanner;

public class BlackjackKeepHand {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int house = scan.nextInt();
        int player = scan.nextInt();
        scan.close();

        String result = "";

        if (player >21){
            result = "player bust";
        }else if (house > player){
            result = "player loss";
        }else if(player > house){
            result = "player win";
        }else{
            result = " its a tie";
        }

        System.out.println(result);
    }
}
/*
In blackjack after the player asks to keep the house 4 things may happen.

if the card total is bigger then 21 the player busts.
if the house score is bigger then the player, the player loses .
if the player score is equal to the house then they are a draw.
if the player score is bigger then the house the player wins.
player and house scores are represented by player and house int variables.

check them using ifs to determine the result.

Example:

input:
8
21
​
output: player win

input:
10
7
​
output: player loss

input:
4
4
​
output: its a tie

input:
 7
 12
  ​
output: player win

input:
10
25
​
output: player bust
 */