//Java method to transpose a given 2D array {{1,4,7},{2,5,8},{3,6,9}}

/*
* i/p
* 1 4 7
* 2 5 8
* 3 6 9
*
* o/p
* 1 2 3
* 4 5 6
* 7 8 9
*/

package assignments_and_homeworks;

public class Array_2D_3 {
    public static void main(String[] args) {
        int [][] arr = {{1,4,7},{2,5,8},{3,6,9}};
        int row = arr.length;
        int column = arr[0].length;
        for (int i=0; i<column; i++) {
            for (int j=0; j<row; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
