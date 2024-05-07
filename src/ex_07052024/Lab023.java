package ex_07052024;

public class Lab023 {
    public static void main(String[] args) {
        // Functions - Block of code that performs a specific task
        // It can be reused
        int a = 10;
        int b = 40;
        int c = a+b;
        System.out.println(c);

        /*
        * Functions are called Methods when we use it in separate class
        * Return something - returntype other than void
        * 2.Don't return anything - void returntype
        * 2.1.Give function definition
        * 2.2.Then call the function
        */
        saySomething();
        int result = sum_of_two_numbers();
        System.out.println(result);
        System.out.println(sumOfTwo(10,20));
        System.out.println(sumOfTwo("Suja",11));
    }

    static String sumOfTwo(String a, int b) {
        return a+b;
    }

    static int sumOfTwo(int a, int b) {
        return a+b;
    }

    static int sum_of_two_numbers() {
        return 5+6;
    }

    static void saySomething() {
        System.out.println("Hello !!!");
    }

}
