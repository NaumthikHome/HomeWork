package less2;

import java.util.Scanner;

public class main {
    static Scanner z=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        int a = z.nextInt();
        int b = z.nextInt();
        boolean d = a>b;
        System.out.println(d);
    }

}
