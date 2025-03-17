import java.util.Arrays;
import java.util.Scanner;

public class MaxCarInParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]lot = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                lot[i][j]  = sc.nextInt();
            }
        }
//        int []res = new int[row];
        int max = 0;
        int inx = -1;
        for(int x = 0 ; x < row ; x++){
            int count = 0;
            for (int i = 0; i < col; i++) {
                if(lot[x][i] == 1){
                    count++;
                }
            }
            if(max < count){
                max = count;
                inx = x;
            }

        }
//        int inx = -1;
//        for (int i = 1; i < row; i++) {
//            if(res[i] > res[i-1]){
//                inx = i;
//            }else {
//                inx = i-1;
//            }
//        }
        System.out.println(inx+1);
    }
}
