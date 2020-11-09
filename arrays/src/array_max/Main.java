package array_max;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        int[] arr1;
        arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = (int) Math.floor(Math.random() * 32) + 154;
        int max = 154;
        int min = 186;
        int nMax = 0;
        int nMin = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
                nMin = i;
            }
            if (arr1[i] > max) {
                max = arr1[i];
                nMax = i;
            }
            System.out.println(arr1[i]);
        }
        System.out.println("Самый низкий " + min + " в списке с номером " + nMin);
        System.out.println("Самый высокий " + max + " в списке под номером " + nMax);
    }
    {int s=0;
        for (int i = 0; i < 15 ; i++) {
            s+=arr1[i];
        }
        System.out.println("Сумма равна " + s);
        double n=s/15;
        System.out.println("Среднее равно " + n);
    }
}
//154
//186
//186-154=32