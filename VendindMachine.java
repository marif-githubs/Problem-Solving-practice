import java.util.Scanner;

public class VendindMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  m = sc.next();
        int val = 0;
        String []Coffee = {
        "Espresso Coffee",
        "Cappuccino Coffee",
        "Latte Coffee"};
        String []Tea ={

       " Plain Tea",
       " Assam Tea",
        "Ginger Tea",
        "Cardamom Tea",
       " Masala Tea",
       " Lemon Tea",
       " Green Tea",
        "Organic Darjeeling Tea"};

        String []Soups = {
                "Hot and Sour Soup",
                "veg Corn Soup",
                "Tomato Soup",
                "Spicy Tomato Soup"};
        String []Beverages ={

        "Hot Chocolate Drink",
        "Badam Drink",
        "Badam-Pista Drink"};
        switch (m){
            case "C":
                val = sc.nextInt();
                switch (val){
                    case 1:
                        System.out.println("Enjoy your"+ Coffee[0]+"!");
                    case 2:
                        System.out.println("Enjoy your"+ Coffee[1]+"!");
                    case 3:
                        System.out.println("Enjoy your"+ Coffee[2]+"!");

                }
            case "T":
                val = sc.nextInt();
                switch (val){
                    case 1:
                        System.out.println("Enjoy your"+ Tea[0]+"!");
                    case 2:
                        System.out.println("Enjoy your"+ Tea[1]+"!");
                    case 3:
                        System.out.println("Enjoy your"+ Tea[2]+"!");

                }
            case "S":
                val = sc.nextInt();
                switch (val){
                    case 1:
                        System.out.println("Enjoy your"+ Soups[0]+"!");
                    case 2:
                        System.out.println("Enjoy your"+ Soups[1]+"!");
                    case 3:
                        System.out.println("Enjoy your"+ Soups[2]+"!");

                }
            case "B":
                val = sc.nextInt();
                switch (val){
                    case 1:
                        System.out.println("Enjoy your"+ Beverages[0]+"!");
                    case 2:
                        System.out.println("Enjoy your"+ Beverages[1]+"!");
                    case 3:
                        System.out.println("Enjoy your"+ Beverages[2]+"!");

                }
        }
    }
}
