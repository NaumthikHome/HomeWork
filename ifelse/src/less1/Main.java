package less1;

        import java.util.Scanner;

public class Main {
    static Scanner z=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        int a = z.nextInt();
        int b = z.nextInt();
        System.out.println(a>b);
    }

}
