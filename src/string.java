import java.util.Scanner;

public class string {

        public static void main(String[] args){
            String firstName, lastName;
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your first name: ");
            firstName = scan.next();
            System.out.print("Please enter your last name: ");
            lastName = scan.next();

            System.out.println("Hello, My name is "+ firstName + " " + lastName);

        }
    }



