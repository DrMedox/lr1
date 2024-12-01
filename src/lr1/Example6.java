package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String firstName = in.nextLine();

        System.out.println("Input last name: ");
        String lastName = in.nextLine();

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Hello " + lastName  + " " + firstName + " " + surname);
        in.close();

    }
}