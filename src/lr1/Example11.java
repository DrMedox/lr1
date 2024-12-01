package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Вас зовут:");
        String userName = in.nextLine();
        System.out.println("Введите год рождения:");
        int yearOfBirth = in.nextInt();

        System.out.println("Вас зовут " + userName + " и вам " + (2024-yearOfBirth) + " лет");

        in.close();
    }
}
