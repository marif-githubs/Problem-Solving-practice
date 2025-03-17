import java.util.Scanner;

public class DoctorIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        int income = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            if(i < 17){
                income += 200;
            }else if( 17 <= i && i <= 40){
                income += 400;
            }else {
                System.out.println(i);
                income += 300;
            }
        }
        System.out.println(income);
    }
}
