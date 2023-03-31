import java.util.Scanner;

class animal {
    String name;
    double height;
    int weight;
    int speed;

    void show() {
        System.out.println("項目姓名： " + name + "\t身高： " + height + "\t體重： " + weight + "\t速度： " + speed);
    }

    int distance(int x, double y) {
        int z = x * (int) y * speed;
        return z;
    }
}

public class A1113325_0324_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        animal[] a = new animal[4];
        a[0] = new animal();
        a[1] = new animal();
        a[2] = new animal();
        a[3] = new animal();

        a[0].name = "雪寶";
        a[0].height = 1.1;
        a[0].weight = 52;
        a[0].speed = 100;

        a[1].name = "驢子";
        a[1].height = 1.5;
        a[1].weight = 99;
        a[1].speed = 200;

        a[2].name = "安那";
        a[2].height = 1.7;
        a[2].weight = 48;
        a[2].speed = 120;

        a[3].name = "愛沙";
        a[3].height = 1.7;
        a[3].weight = 50;
        a[3].speed = 120;

        a[0].show();
        a[1].show();
        a[2].show();
        a[3].show();

        for (int i = 0; i < a.length; i++) {
            System.out.println("請輸入" + a[i].name + "的時間：");
            int T = sc.nextInt();
            System.out.println("是否要輸入" + a[i].name + "的加速度？（輸入 Y 或 N）");
            String input = sc.next();
            double A;
            if (input.equals("Y") || input.equals("y")) {
                System.out.println("請輸入" + a[i].name + "的加速度：");
                A = sc.nextDouble();
            } else {
                A = 1.0;
            }

            int D = a[i].distance(T, A);
            System.out.println(a[i].name + "的奔跑距離是： " + D + "公尺");
        }

        sc.close();
    }
}