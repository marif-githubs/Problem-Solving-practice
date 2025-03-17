import java.util.Scanner;

public class ProductOfAllValues {
    int number ;
    int res = 1;
    ProductOfAllValues(){
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    while(number != 0){
        res *= (number % 10);
        number = number/10;
    }
    }

    public static void main(String [] args){
        System.out.println("98");
        ProductOfAllValues p = new ProductOfAllValues();
        System.out.println(p.res);
    }
}
