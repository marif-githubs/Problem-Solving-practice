import java.util.Scanner;

public class SelfExcludeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int darr[] = new int[size];
        int product = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == j) continue;
                product *= arr[j];
            }
            darr[i] = product;
            product = 1 ;
        }
        for(int k : darr){
            System.out.println(k);
        }
    }
}
