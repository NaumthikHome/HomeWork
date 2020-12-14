package calculator;

public class Main {
    public static void main(String[] args) {
      Model m1 = new Model();
      m1.x = 50;
      m1.y = 12;
      Model m2 = new Model();
      m2.x = 100;
      m2.y = 45;
      Controller c=new Controller();
      int summa = c.add(m1.x,m1.y);
      int ras = c.difference(m2.x,m2.y);
      int umno = c.composition(m2.x,m2.y);
      double del = c.div(m2.x,m2.y);
      View v = new View();
      System.out.println("Сумма равна");
              v.displayInteger(summa);
      System.out.println("Разность равна");
              v.displayInteger(ras);
      System.out.println("Умножение равно");
              v.displayInteger(umno);
      System.out.println("Деление равно");
              v.displayDouble(del);
    }
}
