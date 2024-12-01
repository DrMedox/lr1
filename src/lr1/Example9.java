package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Название месяца:");
        String nameOfTheMonth = in.nextLine();

        System.out.println("Количество дней в этом месяце:");
        int numberOfDaysInAMonth = in.nextInt();

        System.out.println("Месяц - " + nameOfTheMonth + " и в нем " + numberOfDaysInAMonth + " дней.");
        in.close();
    }
}