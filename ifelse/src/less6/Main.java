package less6;

import java.util.Scanner;

public class Main {
    static Scanner z = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите два числа");
        int x = z.nextInt();
        int y = z.nextInt();
        int d = x*x + y*y;
        boolean d1= d<=4;
        if (d1){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
    }
}
