package loop_rec3;

import java.util.Scanner;

public class Main {
    static Scanner tt=new Scanner(System.in);
    public static int stepen(double n){
        if (n == 1){
            return 1;
        }
        else if (n >1 && n < 2){
        return 0;
    }
        else
            return stepen(n/2);
    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        double a=tt.nextDouble();
        if (stepen(a)==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
