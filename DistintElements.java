import java.util.Scanner;

public class DistintElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int dis = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i-1]){
                dis++;
            }
        }
        System.out.println(dis);
    }
}
