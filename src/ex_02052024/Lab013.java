package ex_02052024;

public class Lab013 {
    public static void main(String[] args) {
        int a = 10;
        // Array - collection of data with similar datatype
        int[] ages = {27,31,32,28,30};
        System.out.println(ages[0]);
        // System.out.println(ages[5]); // ArrayIndexOutOfBoundsException
        // System.out.println(ages[-1]); // ArrayIndexOutOfBoundsException
        System.out.println(ages.length);

        int[] ages2 = new int[5];
        System.out.println(ages2[0]); // default value 0 will be printed
        ages2[0]=27;
        ages2[1]=31;
        ages2[2]=32;
        ages2[3]=28;
        ages2[4]=30;

        String[] breakfast_items = {"Milk","Idly","Fruits"};
        System.out.println(breakfast_items.length);
    }
}
