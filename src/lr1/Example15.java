package lr1;
import java.util.Scanner;
import java.math.MathContext;
public class Example15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Первое число:");
        int firstNumber = in.nextInt();
        System.out.println("Второе число:");
        int secondNumber = in.nextInt();

        System.out.println("Сумма чисел = " + (firstNumber+secondNumber));
        System.out.println("Разница чисел = " + Math.abs(firstNumber-secondNumber));

        in.close();
    }
}