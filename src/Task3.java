import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        //variables
        String party;
        Scanner scan = new Scanner(System.in);

        //inputs
        System.out.println("What is your party affiliation? Enter 'R' for Republican, 'D' for Democrat, and 'I' for Independent");
        party = scan.nextLine();

        //outputs
        if (party.equals("R")){
            System.out.println("You get a Republican Elephant.");
        } else if (party.equals("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (party.equals("I")) {
            System.out.println("You get an Independent Person");
        } else {
            System.out.println("You entered an invalid party Affiliation please try again using I, R, or D");
            System.exit(0);
        }
    }
}
