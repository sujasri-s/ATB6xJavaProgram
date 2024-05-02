// Create a program to double an array and store it also. {1,2,3} -> {2,4,6}

package assignments_and_homeworks;

public class Array_2 {
    public static void main(String[] args) {
        int[] num = {2,5,7};
        int[] double_num = new int[num.length];
        for (int i=0; i<num.length; i++) {
            double_num[i] = num[i]*2;
        }
        for (int i=0; i<num.length; i++) {
            System.out.println(double_num[i]);
        }
    }
}
