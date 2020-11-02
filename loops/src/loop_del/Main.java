package loop_del;

import java.util.Scanner;

public class Main {
    static Scanner ww=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите произвольное число");
        int a = ww.nextInt();
        int b = 1;
        int n=0;
        while (b <= a){
            int r =a % b;
            if(r == 0){
                n+=1;
            }
            b+=1;
        }
        System.out.println("число имеет "+n+" делителей");
    }
}
