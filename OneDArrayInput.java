import java.util.Scanner;

public class OneDArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int s = 0;
        if (sc.hasNextInt()) {
            s = sc.nextInt();
        }

        // Initialize the array's
        // size using user input
        int[] arr = new int[s];

        // Take user elements for the array
        System.out.println(
                "Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println(
                "The elements of the array are: ");
        for (int i = 0; i < s; i++) {

            System.out.print(arr[i] + " ");
        }
        sc.close();
        OneDArrayInput o = new OneDArrayInput();
        o.pront(arr, s);
    }
    public void pront(int[] arr,int s){
        System.out.println(arr[s-1]);
    }
}
