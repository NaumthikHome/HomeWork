package pak2;

import java.util.Scanner;

public class Main {
 static Scanner z = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Кол-во населения в Житомирской области");
        int a = z.nextInt();
        System.out.println("Кол-во населения в Винницкой области");
        int b = z.nextInt();
        System.out.println("Кол-во населения в Черкасской области");
        int c = z.nextInt();
        System.out.println("Кол-во населения в Кировоградской области");
        int d = z.nextInt();

        Sum1 r=new Sum1(a,b);
        int rr = r.sum(a,b);
        System.out.println("Сумма населения Житомирской и Винницкой областей равна " + rr);

        Sum2 w=new Sum2(c,d);
        int ww = w.sum(c,d);
        System.out.println("Сумма населения Черкасской и Кировоградской областей равна " + ww);

        pak3.Main y=new pak3.Main();
        int yy = y.sum(b,c,d);
        System.out.println("Сумма населения Винницкой,Черкасской и Кировоградской областей равна " + yy);
    }
}
