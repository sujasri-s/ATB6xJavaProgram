package ex_18042024;

public class Lab010 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte + byte = int
        System.out.println(a+b); // Result is of type integer

        byte c = 10;
        int d = c; // Implicit casting -> JVM (don't want to specify)

        byte e = 10;
        int f = (int) e; // Explicit casting -> User

        int a1 = 300;
        byte b1 = (byte) a1; // Explicit casting
        /*
        * 300 converted into 32 bits (int)
        * 00000000000000000000000100101100
        * byte can store only 8 bits
        * 00101100
        * so output becomes 44*/
        System.out.println(b1);
    }
}
