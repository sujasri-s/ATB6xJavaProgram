// Java method to check if a given element exists in a 2D array. ( element =8) , true

package assignments_and_homeworks;

import java.util.Scanner;

public class Array_2D_2 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to be searched:");
        int find_num = sc.nextInt();
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if(find_num == arr[i][j]) {
                    count+=1;
                    break;
                }
            }
            if(count!=0) {
                System.out.println("Element is present");
                break;
            }
        }
        if(count == 0) {
            System.out.println("Element is not present");
        }
    }
}
