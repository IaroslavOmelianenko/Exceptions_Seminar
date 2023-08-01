import java.util.Scanner;

/***
 * Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
 * Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на 0 недопустимо".
 * В противном случае программа должна выводить результат деления.
 */
public class Task2 {
    public static void tryDivide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        int dividend = scanner.nextInt();
        System.out.print("Второе число: ");
        int divisor = scanner.nextInt();
        try {
            if (divisor == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            int result = dividend / divisor;
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }
}
