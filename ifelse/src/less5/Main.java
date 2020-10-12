package less5;

public class Main {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        boolean z =true;
        boolean a1 = !x & !y;
        boolean a2 = x & !y | z;
        boolean a3 = x &(!y & !z);
        System.out.println(a1 + "  " +a2 + "  " + a3);
    }
}
