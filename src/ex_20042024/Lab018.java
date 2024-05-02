package ex_20042024;

public class Lab018 {
    public static void main(String[] args) {
        boolean result = 10>40 ? 10>40 : 40>10;
        System.out.println(result);
        int a = true ? 10 : 20;
        int a1 = 30>40 ? 10 : 20;
        System.out.println(a);
        System.out.println(a1);

        int b1 = 10;
        int b2 = 20;
        int max = b1<b2 ? b2 : b1;
        int min = b1>b2 ? b2 : b1;
        System.out.println(max);
        System.out.println(min);
    }
}
