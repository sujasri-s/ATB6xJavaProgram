/*
Take an input from user, input1, input2 as int and ask the user what you want to do,
enter char +,*,/ ,%, - , you will share the result by using the switch
 */

package assignments_and_homeworks;

import java.util.Scanner;

public class ArithmeticOperations_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first input:");
        int input1 = sc.nextInt();
        System.out.println("Enter the second input:");
        int input2 = sc.nextInt();
        System.out.println("Which operation among below has to be performed?");
        System.out.println("For addition operation, enter add");
        System.out.println("For subtraction operation, enter sub");
        System.out.println("For multiplication operation, enter mul");
        System.out.println("For division operation, enter div");
        System.out.println("For modulus operation, enter mod");
        String operation_name = sc.next();
        switch (operation_name) {
            case "add":
                System.out.println(input1+input2);
                break;
            case "sub":
                System.out.println(input1-input2);
                break;
            case "mul":
                System.out.println(input1*input2);
                break;
            case "div":
                System.out.println(input1/input2);
                break;
            case "mod":
                System.out.println(input1%input2);
                break;
        }
    }

}
