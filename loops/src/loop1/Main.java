package loop1;

import java.util.Scanner;

public class Main {
    static Scanner tt=new Scanner(System.in);
    public static void main(String[] args) {
        //Вывод таблицы умножения через while
        System.out.println("Введите параметр таблицы умножения");
        int a=tt.nextInt();
        int n=1;
        while (n<=10) {
            System.out.println(a+" * "+n+" = "+a*n);
           n++;
        }
        //Вывод таблицы умножения через do
        int b=tt.nextInt();
        int m=1;
                do{
                    System.out.println(b+" * "+m+ " = "+b*m);
                    m++;
                }while (m<=10);
        //Вывод таблицы умножения через for
        int c=tt.nextInt();
        for (int h=1;h<=10;h++){
            System.out.println(c+ " * "+h+ " = "+c*h);
        }
    }
}
