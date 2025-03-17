import java.util.Scanner;


public class OddEvenVehicles {
    int size = 0;
    int date = 0;
    int fine = 0;
    int []arr = init();
    public int[] init(){
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        date = sc.nextInt();
        fine = sc.nextInt();
        return arr;
    }

    public boolean EvenOrOddDay(int num){
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public void fineCal(){
        int count = 0;
        boolean day = EvenOrOddDay(date);
        for (int i = 0; i < arr.length; i++) {
            if(day != EvenOrOddDay(arr[i])){
                count++;
            }
        }
        System.out.println("total fine is "+count*fine);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        OddEvenVehicles oev = new OddEvenVehicles();
        oev.fineCal();
    }
}
