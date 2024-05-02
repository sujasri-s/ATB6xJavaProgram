// Java program to check the result of using Increment and Decrement operators

package assignments_and_homeworks;

public class Increment_Decrement_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(--b + b++ + ++b);
    }
}
