import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            String[] arr = s.split("");
            String res = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                res += arr[i];

            }
            System.out.println(res);
        }
    }
}
