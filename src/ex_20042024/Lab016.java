package ex_20042024;

public class Lab016 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        String name2 = new String("The Testing Academy");
        String name3 = new String("The Testing Academy");
        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));

        // Primitive datatype can't use "new" operator
        // java.lang.* package is added by default so we don't have to import it explicitly
    }
}
