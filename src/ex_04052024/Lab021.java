package ex_04052024;

public class Lab021 {
    public static void main(String[] args) {
        String s1 = "Suja";
        String s2 = new String("Suja");

        // String Builder is not thread safe
        // String Buffer is thread safe

        StringBuffer stringBuffer = new StringBuffer("Suja");
        stringBuffer.append("sri");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
