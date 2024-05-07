package ex_04052024;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        // Palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String user_input = sc.next();
        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_user_input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
