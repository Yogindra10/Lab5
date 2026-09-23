import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        int birthMonth;
        Scanner scan = new Scanner(System.in);

        //inputs
        System.out.println("Enter your value of your birth month, (values | (1-12))");
        birthMonth = scan.nextInt();

        //outputs
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is " + birthMonth);
        } else {
            System.out.println("You entered an incorrect birth month value " + birthMonth );
            System.exit(0);
        }

    }
}
