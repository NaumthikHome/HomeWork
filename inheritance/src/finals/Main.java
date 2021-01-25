package finals;

public class Main {
    public static void main(String[] args) {
 int x = 10;
 //x++;
        System.out.println(x);
        Human h1 = new Human("Artem","",24,13);
        Human h2 = new Human("Danyil danon","",45,23);
        final Human h3 = new Human("Maria","",8,31);
        Human[] h ={h1,h2,h3};
        for(Human temp : h){
            System.out.println(temp);
        }
        //h3.birthday = 23;
        final int x1 =fabrica(100);
        //x1++;
        System.out.println(x1);
    }
    static int fabrica(int range){
        return (int)(Math.random()*range);
    }
}
class Human{
    static final String NAME = "Danyil danon";
    String address;
    int weight;
    final int birthday;

    public Human(String NAME,String address, int weight, int birthday) {
        this.address = address;
        this.weight = weight;
        this.birthday = birthday;
    }
}

