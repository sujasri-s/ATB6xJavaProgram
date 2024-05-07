package ex_07052024;

public class Lab024 {
    public static void main(String[] args) {
        // no returntype no parameter
        saySomething();
        // no returntype with parameter
        sayHello("Suja");
        // with returntype no parameter
        System.out.println(sumOfTwoNums());
        // with returntype with parameter
        System.out.println(sumOfTwoNum(12,23));
    }

    static int sumOfTwoNums() {
        return 10+75;
    }

    static int sumOfTwoNum(int a, int b) {
        return a+b;
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void saySomething() {
        System.out.println("Hello");
    }


}
