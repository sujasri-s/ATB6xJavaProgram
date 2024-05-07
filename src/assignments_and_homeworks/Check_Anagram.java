// Java Anagrams - silent -> listen , length1 = length2

package assignments_and_homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String name1 = sc.next().toLowerCase();
        System.out.println("Enter the second string:");
        String name2 = sc.next().toLowerCase();
        char [] arr1 = new char[name1.length()];
        char [] arr2 = new char[name2.length()];
        if (name1.length()==name2.length()) {
            for (int i=0; i<name1.length(); i++) {
                arr1[i] = name1.charAt(i);
                arr2[i] = name2.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        } else {
            System.out.println("Not an anagram");
        }
    }
}