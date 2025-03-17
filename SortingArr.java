import java.util.Scanner;

public class SortingArr {

    public static void main(String[] args) {

    int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int[]index = new int[3];
        for(int i =0 ; i < arr.length; i++){
            if(arr[i] == 0){
                index[0]++;
            } else if (arr[i] == 1) {
                index[1]++;
            }else {
                index[2]++;
            }
        }
        int s = 0;
        int in = 0;
        for (int c:index) {
            for (int i = 0; i < c; i++) {
                arr[in] = s;
                in++;
            }
            s++;
        }
        for(int k:arr) {
            System.out.println(k);
        }
    }


}
