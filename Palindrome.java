import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []arr = s.split("");
        int t = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(!(arr[i].equals(arr[t]))){
                System.out.println(s+" "+ "is not a palindrome");
                break;
            }
            --t;
        }
        System.out.println(s+" is a palindrome");
    }
}
