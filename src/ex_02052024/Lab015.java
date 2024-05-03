package ex_02052024;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
        // System.out.println(args[0]); // default value not given
        String[] name = new String[5];
        System.out.println(name[0]); // new operator gives default value
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter Sub1 marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter Sub2 marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter Sub3 marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter Sub4 marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter Sub5 marks");
        marks[4] = sc.nextFloat();
        for (int i=0;i<marks.length;i++) {
            if(marks[i]<30) {
                System.out.println("Failed");
            }
            else {
                System.out.println(marks[i]);
            }
        }
        sc.close();
    }
}
