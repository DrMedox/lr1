package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Первое число:");
        int firstNumber = in.nextInt();
        System.out.println("Второе число:");
        int secondNumber = in.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));

        in.close();
    }
}