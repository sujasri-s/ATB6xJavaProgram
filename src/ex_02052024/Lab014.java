package ex_02052024;

public class Lab014 {
    public static void main(String[] args) {
        // In case of Array, the final keyword is to fix the size of array and not the values
        final int[] ages = new int[4];
        // ages = {0,0,0,0}
        ages[3] = 78;
        ages[3] = 79;
        System.out.println(ages[3]);

        // == -> Ref
        // .equals() -> values
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
        int[] arr3 = arr1;
        System.out.println(arr1);
        System.out.println(arr3);
        System.out.println(arr1==arr3);

        String s1 = "Suja";
        String s2 = "Suja";
        System.out.println(s1.equals(s2)); // only for string equals method checks for content

        int a[] = {1,2,3,4,5};
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
