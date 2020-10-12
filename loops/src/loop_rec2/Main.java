package loop_rec2;

import java.util.Scanner;

public class Main {
    static Scanner r=new Scanner(System.in);
    public static int lera(int r) {
        if (r < 10) {
            return r;
        }
        return r%10 + lera(r/10);
    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        int a=r.nextInt();
        System.out.println(lera(a));
    }
}

