package ex_18042024;

public class Lab011 {
    public static void main(String[] args) {
        // Increment ++, Decrement --
        // Pre-increment
        int a = 10;
        int b = ++a;
        System.out.println(a); // 11
        System.out.println(b); // 11
        // Post-increment
        int c = 10;
        int d = c++;
        System.out.println(c); // 11
        System.out.println(d); // 10
        // Pre-decrement
        int e = 10;
        int f = --e;
        System.out.println(e); // 9
        System.out.println(f); // 9
        // Post-decrement
        int g = 10;
        int h = g--;
        System.out.println(g); // 9
        System.out.println(h); // 10

        int i = 10;
        // System.out.println(++i + ++i);
        System.out.println(i++ + ++i);

    }
}
