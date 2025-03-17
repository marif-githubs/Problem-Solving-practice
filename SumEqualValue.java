import java.util.Scanner;

public class SumEqualValue {

    public int sumCombination(int []arr , int val){
        int num = arr.length;
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if(arr[i] < val) sum += arr[i];
            if(sum == val){
                counter++;
            }else {
                for (int j = i + 1; j < num; j++) {
                    if (sum + arr[j] <= val){
                        sum += arr[j];
                    }
                    if(sum == val) {
                        counter++;
                        continue;
                    }
                }
            }
            sum = 0;
        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SumEqualValue sev = new SumEqualValue();
        int frequent = sc.nextInt();

        while (frequent >0){
            int number = sc.nextInt();
            int []arr = new int[number];
            for (int i = 0; i < number; i++) {
                arr[i] = sc.nextInt();
            }
            int val = sc.nextInt();

            System.out.println(sev.sumCombination( arr, val));
            frequent--;
        }
    }
}
