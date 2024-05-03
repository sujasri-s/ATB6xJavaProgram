// Java program to find if a given number is positive or negative or Zero

package assignments_and_homeworks;

import java.util.Scanner;

public class Positive_Negative_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0) {
            System.out.printf("The given number %d is positive",num);
        } else if (num<0) {
            System.out.printf("The given number %d is negative",num);
        } else {
            System.out.printf("The given number %d is Zero",num);
        }
        sc.close();
    }
}
