// Create a program which takes array and print all the marks

package assignments_and_homeworks;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to be present in the array:");
        int num = sc.nextInt();
        int[] marks = new int[num];
        System.out.println("Enter all the marks");
        for (int i=0; i<marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
