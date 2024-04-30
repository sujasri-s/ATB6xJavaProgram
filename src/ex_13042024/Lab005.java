package ex_13042024;

public class Lab005 {
    public static void main(String[] args) {
        int age = 18;
        /*
        * %d -> any integer - byte, short, int or long
        * %s -> String
        * %c -> char
        * %f -> float
        */
        System.out.printf("Ritu age is %d \n", age);
        System.out.println("Ritu age is "+ age);
        System.out.print("Hello");
        System.out.println("Hi");
        //Non-primitive datatype
        String name = "Suja";
        System.out.printf("Your name is %s\n", name);

        // Unicode characters starts from \u0041 -> A
        System.out.println("\uF042");
    }
}
