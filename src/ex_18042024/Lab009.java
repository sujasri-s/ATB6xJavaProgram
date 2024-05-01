package ex_18042024;

public class Lab009 {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b=20;
        System.out.println(b+a);
        System.out.println(b-a);
        System.out.println(b*a);
        System.out.println(b/a);
        System.out.println(b%a);

        // Compound assignment operators
        System.out.println(b+=30);
        System.out.println(b-=20);
        System.out.println(a*=2);

        // Relational operators - returns Boolean value
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a!=b);
        System.out.println('A'==65);
        System.out.println('A'==65.2);

        // Logical operators
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(!b1);
        System.out.println(!!b2);
        System.out.println(b1 || b2);
        System.out.println(b1 && b2);
    }

}
