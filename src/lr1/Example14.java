package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Начальное число:");
        int firstNumber = in.nextInt();

        System.out.println(firstNumber + " - 1 = "  + (firstNumber-1));
        System.out.println("Первоначальное число = "  + (firstNumber));
        System.out.println(firstNumber + " + 1 = "  + (firstNumber+1));
        System.out.println("Квадрат суммы получившихся чисел:" + (( (firstNumber-1) * (firstNumber-1) ) + ( (firstNumber) * (firstNumber) ) + ( (firstNumber+1) * (firstNumber+1) ) + (2 * (firstNumber-1) * (firstNumber) ) + (2 * (firstNumber) * (firstNumber+1) ) + (2 * (firstNumber-1) * (firstNumber+1))) );

        in.close();
    }
}