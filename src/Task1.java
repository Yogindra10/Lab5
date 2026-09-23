
import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        //variables
        double itemPrice;

        Scanner scan = new Scanner(System.in);

        //inputs
        System.out.println("What is the price of your item?");
        itemPrice = scan.nextDouble();

        //calculations
        if (itemPrice >= 100) {
            System.out.println("Your shipping cost will be free!");
            System.out.println("The price of your item is $" + itemPrice);
        } else if (itemPrice >= 0 && itemPrice < 100) {
            System.out.println("The price of your item is $" + (itemPrice *1.02));
        } else {
            System.out.println("You entered an invalid item price, Please Try Again");
            System.exit(0);
        }
    }
}
