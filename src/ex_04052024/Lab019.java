package ex_04052024;

public class Lab019 {
    public static void main(String[] args) {
        int[] salaries = {30,50,60,90,10,100,999};
        int max_salary = Integer.MIN_VALUE; // -2147483648

        for (int i=0; i< salaries.length; i++) {
            if(salaries[i] > max_salary) {
                max_salary = salaries[i];
            }
        }
        System.out.println(max_salary);

        // 2 Dimensional arrays
        // Matric - rows and columns
        int [][] array_2d = {
                {34,12,11},
                {34,12,34},
                {11,23,98},
        };
        int [][] array_2d_1 = new int[3][3];
        array_2d_1[0][0] = 34;
        array_2d_1[0][1] = 12;

        for (int i=0; i<array_2d.length; i++) {
            for (int j=0; j<array_2d[i].length; j++) {
                System.out.println(array_2d[i][j]);
            }
        }

    }
}
