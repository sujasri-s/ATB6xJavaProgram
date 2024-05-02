// Program to find the max salary in the input array {30,50,60,90,10,100,999}

package assignments_and_homeworks;

public class Array_3 {
    public static void main(String[] args) {
        int[] salary = {30,50,60,90,10,100,999};
        int max = 0;
        for (int i=0; i< salary.length; i++) {
            if(salary[i]>max) {
                max = salary[i];
            } else {
                continue;
            }
        }
        System.out.println("The maximum number is " + max);
    }
}
