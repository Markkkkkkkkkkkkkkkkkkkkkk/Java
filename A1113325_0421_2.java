import java.util.*;

public class A1113325_0421_2 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        String date_check1 = "[0-9]{4}/([0][0-9]||[1][1-2])/([0-2][0-9]||[3][0-1])";
        String date_check2 = "([0][0-9]||[1][1-2])/([0-2][0-9]||[3][0-1])/[0-9]{4}";

        System.out.println("請依照格式輸入日期(YYYY/MM/DD or MM/DD/YYYY)：");
        String date = sc.next();

        while (!(date.matches(date_check1) || date.matches(date_check2))) {
            System.out.println("請輸入正確的日期格式(YYYY/MM/DD or MM/DD/YYYY)：");
            date = sc.next();
        }

        if (date.matches(date_check1))
            System.out.println(date.substring(0, 4) + "年" + date.substring(5, 7) + "月" + date.substring(8, 10) + "日");
        else if (date.matches(date_check2))
            System.out.println(date.substring(6, 10) + "年" + date.substring(0, 2) + "月" + date.substring(3, 5) + "日");
    }
}