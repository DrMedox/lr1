package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Введите название месяца:");
    String nameOfTheMonth = in.nextLine();

    System.out.println("Введите день недели:");
    String dayOfTheWeek = in.nextLine();

    System.out.println("Введите число месяца:");
    int dayOfTheMonth = in.nextInt();


    System.out.println(dayOfTheWeek + ", " + dayOfTheMonth + ", " + nameOfTheMonth);

    in.close();
    }
}
