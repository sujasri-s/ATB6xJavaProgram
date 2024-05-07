// Java program to reverse a String without using any function or using for loop

package assignments_and_homeworks;

import java.util.Scanner;

public class Reverse_String {
    static String reverse_string(String w, int l) {
        if (l==0) {
            return w.charAt(0) +"";
        } else {
            return w.charAt(l) + reverse_string(w,l-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be reversed:");
        String word = sc.next();
        int len = word.length()-1;
        String rev_name = reverse_string(word,len);
        System.out.println(rev_name);
    }
}
