public class Practice1 {
    //print how money prior elements are small
    public static void main(String[] args) {
        int n = 5;
        int []arr = {3,4,5,8,9};
//        int []arr = {8,7,4,7,45};
        int c = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]){
                c++;
            }
        }
        System.out.println(c);
    }
}
