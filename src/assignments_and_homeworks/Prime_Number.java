// Java program to check if the given number is a prime number or not

package assignments_and_homeworks;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num<=0) {
            System.out.println("Enter a valid number");
        } else if (num==1) {
            System.out.println("1 is neither prime nor composite");
        } else {
            for (int i=2; i<num; i++) {
                if(num%i==0) {
                    count=1;
                    System.out.println(num + " is not a prime number");
                    break;
                }
            }
            if(count==0) {
                System.out.println(num + " is a prime number");
            }
        }
        sc.close();
    }
}
