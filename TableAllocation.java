import java.util.Arrays;
import java.util.Scanner;

public class TableAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coustomer = sc.nextInt();
        int table = sc.nextInt();
        int []arrtable = new int[table];
            Arrays.fill(arrtable,-1);
        int [][]data = new int[coustomer][3];

        for (int i = 0 ; i < coustomer ; i++){
            for (int j = 0; j < 3; j++) {
                data[i][j] = sc.nextInt();

            }
        }

        int Allocated = 0;
        for (int i = 0; i < coustomer; i++) {
            int []temp = data[i];
            if(arrtable[temp[2]-1] == -1){
                arrtable[temp[2]-1] = i;
                System.out.println(arrtable[temp[2]-1]);
                Allocated++;

            }else if(temp[0] > (data[arrtable[temp[2]-1]][0] + data[arrtable[temp[2]-1]][1]  )){
                System.out.println(temp[0] +","+ (data[arrtable[temp[2]-1]][0] +","+ data[arrtable[temp[2]-1]][1]  ));
                arrtable[temp[2]-1] = i;
                Allocated++;
            }else {
                System.out.println("not "+i);
            }

        }
        System.out.println(Allocated);
    }
}
