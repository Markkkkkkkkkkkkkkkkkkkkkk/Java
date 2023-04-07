import java.util.Scanner;

class animal {
    String name;
    double height;
    int weight;
    int speed;

    animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("項目姓名： " + name + "\t身高： " + height + "\t體重： " + weight + "\t速度： " + speed);
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統!!");
    }

    int distance(int x, double y) {
        int z = x * (int) y * speed;
        return z;
    }

    int distance(int x) {
        return x * this.speed;
    }
}

class human extends animal {
    String gender;

    human(String name, double height, int weight, int speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    public void show() {
        System.out.println(
                "項目姓名： " + name + "\t身高： " + height + "\t體重： " + weight + "\t速度： " + speed + "\t性別： " + gender);
    }
}

class snow extends human {
    String freezingskill;

    snow(String name, double height, int weight, int speed, String gender, String freezingskill) {
        super(name, height, weight, speed, gender);
        this.freezingskill = freezingskill;
    }

    public void show() {
        System.out.println("項目姓名： " + name + "\t身高： " + height + "\t體重： " + weight + "\t速度： " + speed + "\t性別： "
                + gender + "\t冰凍技能： " + freezingskill);
    }

    int distance(int x, double y) {
        int z = (x * (int) y * speed) * 2;
        return z;
    }
}

public class A1113325_0331 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        animal.showinfo();

        animal[] a = new animal[2];
        a[0] = new animal("雪寶", 1.1, 52, 100);
        a[1] = new animal("驢子", 1.5, 99, 200);

        human[] b = new human[3];
        b[0] = new human("阿克", 1.9, 80, 150, "男");
        b[1] = new human("漢斯", 1.8, 78, 130, "男");
        b[2] = new human("安娜", 1.7, 48, 120, "女");

        snow[] c = new snow[1];
        c[0] = new snow("愛沙", 1.7, 50, 120, "女", "Yes");

        a[0].show();
        a[1].show();
        b[0].show();
        b[1].show();
        b[2].show();
        c[0].show();

        for (animal animals : a) {
            System.out.println("請輸入" + animals.name + "的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入" + animals.name + "的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            double dist;
            if (y > 0)
                dist = animals.distance(x, y);
            else
                dist = animals.distance(x);
            System.out.println(animals.name + "的奔跑距離為" + dist);
        }

        for (human humans : b) {
            System.out.println("請輸入" + humans.name + "的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入" + humans.name + "的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            double dist;
            if (y > 0)
                dist = humans.distance(x, y);
            else
                dist = humans.distance(x);
            System.out.println(humans.name + "的奔跑距離為" + dist);
        }

        for (snow snow : c) {
            System.out.println("請輸入" + snow.name + "的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入" + snow.name + "的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            double dist;
            if (y > 0)
                dist = snow.distance(x, y);
            else
                dist = snow.distance(x);
            System.out.println(snow.name + "的奔跑距離為" + dist);
        }

        sc.close();
    }
}