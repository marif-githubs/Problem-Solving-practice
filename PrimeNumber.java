import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 2){
            System.out.println(num+"number is prime");
        }else{
            for (int i = 2; i < num; i++) {
                if(num % i == 0){
                    System.out.println(num+"number is not a prime");
                    System.out.println(num+"%"+i+"="+num %  i);
                }else {
                    System.out.println(num+"number is prime");
                    System.out.println(num+"%"+i+"="+num %  i);

                }
            }
//      }
//      if(num % 2 == 0){
//
        }
        }
    }
}
