package less3;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {
    static Scanner z = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите три числа");
        int a = z.nextInt();
        int b = z.nextInt();
        int c = z.nextInt();
        int D = b * b - 4 * a * c;
        boolean q = D < 0;
        if (q) {
            System.out.println("Нет корней");
        } else {
            System.out.println("Корни есть");
            double x1 = (-b - sqrt(D)) / (2 * a);
            double x2 = (-b + sqrt(D)) / (2 * a);

            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
}
