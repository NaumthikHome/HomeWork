package loop_sum;

import java.util.Scanner;

public class Main {
    static Scanner z=new Scanner(System.in);
    public static void main(String[] args) {
        //сумма 5 чисел
 int s=0,a;
        for (int i = 0; i <5; i++) {
            System.out.println("Введите " +(i+1) + " число");
            a=z.nextInt();
            s+=a;
                }
        System.out.println("Сумма 5 чисел равна " + s);
       double n=s/5;
        System.out.println("Среднее 5 чисел " + n);
}
}