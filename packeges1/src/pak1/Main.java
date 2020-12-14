package pak1;

import java.util.Scanner;

public class Main {
    static Scanner z=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первый член арифметической прогрессии");
        int a=z.nextInt();
        System.out.println("Введите второй член арифметической прогрессии");
        int d=z.nextInt();
        System.out.println("Сумму какого кол-ва членов требуется найти? ");
        int n=z.nextInt();

        SummPR r= new SummPR(a,d);
        double ss = r.sum(a,d,n);
        System.out.println("Сумма "+ n + " членов арифметической прогрессии = " + ss);
    }

}
