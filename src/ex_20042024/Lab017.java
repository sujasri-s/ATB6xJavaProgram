package ex_20042024;

public class Lab017 {
    public static void main(String[] args) {
        String password = "Hacker@123";
        String password_u = password.toLowerCase();
        System.out.println(password_u);
        System.out.println(password_u.equals(password));
        System.out.println(password_u.equalsIgnoreCase(password));
        System.out.println(password.substring(2,9));
        System.out.println(password.indexOf('a'));
    }
}
