package array_mas3;

public class Main {
    public static void main(String[] args){
        int f;
        int i;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(i<j){
                    a[i][j]=1;
                    System.out.print(a[i][j]+"  ");
                }
                else
                if(i==j){
                    a[i][j]=0;
                    System.out.print(a[i][j]+"  ");
                }
                else {
                    a[i][j]=6;
                    System.out.print(a[i][j]+"  ");}
            }
            System.out.println();  //перевод на новую строку
        }
    }

}
