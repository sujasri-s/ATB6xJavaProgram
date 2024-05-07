/*
* Java method to find the maximum value in a 2D array. - O/P - 9
* int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
*/

package assignments_and_homeworks;

public class Array_2D_1 {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int max = find_Maximum_Number(arr);
        System.out.println(max);
    }

    static int find_Maximum_Number(int[][] a) {
        int maximum = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                if(a[i][j]>maximum) {
                    maximum = a[i][j];
                }
            }
        }
        return maximum;
    }
}
