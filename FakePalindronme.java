import java.util.Scanner;
import java.util.SplittableRandom;

public class FakePalindronme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp = "";
        int counter = 0;
        for(int i = 0 ; i < str.length() ; i++){
            temp += str.charAt(i);
            counter++;
            System.out.println(temp);
            for (int j = i+1; j < str.length(); j++) {
                temp += str.charAt(j);
                String t = new StringBuilder(temp).reverse().toString();
                if(temp.equals(t)) {
                    System.out.println(temp);
                    counter++;
                };
            }
            temp = "";

        }
        System.out.println(counter);

    }
}
