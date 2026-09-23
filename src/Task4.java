import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        //variables
        int age;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("What is your age");
        age = scan.nextInt();

        //outputs
        if (age >= 21) {
            System.out.println("You get a wristband!");
        } else if (age <= 0 ) {
            System.out.println("You have entered an invalid age.");
            System.exit(0);
        }

    }
}
