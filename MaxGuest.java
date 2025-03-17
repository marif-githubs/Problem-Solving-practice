import java.util.Scanner;

public class MaxGuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h  = sc.nextInt();
        int []e = new int[h];
        int []l = new int[h];
        int guest = 0 , max = 0;
        for (int i = 0; i < h; i++) {
            e[i] = sc.nextInt();
        }
        for (int i = 0; i < h; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < h; i++) {
            guest = guest + e[i] - l[i];
            if(max < guest){
                max = guest;
            }
        }
        System.out.println(max);
    }
}
