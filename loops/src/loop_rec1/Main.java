package loop_rec1;

public class Main {
    public static String recursion(int n){
        if(n==1){
            return "1";
        }
        return n + " " + recursion(n-1);
    }
    public static int fact (int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println("Вывод чисел методом рекурсия");
        System.out.println(recursion(12));
        System.out.println("Вычисление факториала методом рекурсия");
        System.out.println(fact(9));
    }
}
