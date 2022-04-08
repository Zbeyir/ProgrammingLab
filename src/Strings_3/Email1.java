package Strings_3;

public class Email1 {

    public static void main(String[] args) {

        String email = "meltem_nalan@gmail.com";

        if (email.contains("_")){

            System.out.print(email.substring(email.indexOf("_") +1 , email.indexOf("@") ) );
            System.out.print("_");
            System.out.print(email.substring(0, email.indexOf("_")));
            System.out.println(email.substring(email.indexOf("@")));


        }else {
            System.out.println(email);
        }


    }
}
/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com
​
output: tyson_mike@gmail.com

input: barakobama@gmail.com
​
output: barakobama@gmail.com
 */