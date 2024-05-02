// Java program to execute mathematic equation cuberoot(x2+y2-mod(z)) and get the result
// x = 10, y = 12.4, z = 56.78

package assignments_and_homeworks;

import java.util.Scanner;

public class Math_Operations_1 {
    public static void main(String[] args) {
        int x = 10;
        float y = 12.4f;
        float z = 56.78f;
        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
    }
}
