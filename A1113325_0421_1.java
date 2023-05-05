import java.util.*;

public class A1113325_0421_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        String email_check = "[a-z0-9]+@([a-z]+.[a-z]+)+";
        System.out.println("Please enter your Email：");
        String email = sc.next();
        while (!email.matches(email_check)) {
            System.out.println("Please enter the right Email：");
            email = sc.next();
        }
    }
}