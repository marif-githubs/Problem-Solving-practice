import java.util.Scanner;

public class BCDConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            int p = 8;
            int b = 2;
            int temp = 0;
            String res = "";
            for (int i = p - 1; i >= 0; i--) {

                if (num >= Math.pow(b, i)) {
                    temp += Math.pow(b, i);
                    if (temp <= num) {
                        res += 1;
                    } else {
                        res += 0;
                        temp -= Math.pow(b, i);
                    }
//                System.out.println( temp +","+res);

//                System.out.println( Math.pow(b, i));

                }

            }
            System.out.println(res);
        }
    }
}
