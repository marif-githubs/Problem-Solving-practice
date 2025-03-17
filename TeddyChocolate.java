import java.util.Scanner;

public class TeddyChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int availableteddy = sc.nextInt();
        int []teddy = new int[days];
        int []chocolate = new int[days];
        for (int i = 0; i < days; i++) {
            teddy[i] = sc.nextInt();
            chocolate[i] = sc.nextInt();
        }
        int totalchoco = 0;
        int temp = 0;
        for (int i = 0; i < days; i++) {
            temp = teddy[i];
            temp = temp - availableteddy;
            if(temp > 0){
                totalchoco += temp * chocolate[i];
            }
        }
        System.out.println(totalchoco);

    }
}
