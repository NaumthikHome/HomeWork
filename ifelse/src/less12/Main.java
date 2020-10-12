package less12;

import java.util.Scanner;

public class Main {
    static Scanner z=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите координаты точки");
        int x1 = 2;
        int x2 = 6;
        int x3 = 1;
        int x4 = -3;
        System.out.println("x=   ");
        int x = z.nextInt();
        int y1 = 6;
        int y2 = 4;
        int y3 = 6;
        int y4 = -4;
        System.out.println("y=   ");
        int y = z.nextInt();
        boolean p1= x>x1 & x<x2 & y<y1 & y>y2;
        if (p1) {
            System.out.println("Принадлежит прямоугольнику");
        }else {
            System.out.println("Не принадлежит прямоугольнику");
        }
        boolean p2 = x>x3 & x<x4 & y>y4 &y<y3;
                if (p2){
                    System.out.println("Принадлежит обеим");}
                else {
                    System.out.println("Не принадлежит");
                }
    }
}
