import java.util.Scanner;

/***
 * Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
 * Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
 * В противном случае программа должна выводить сообщение "Число корректно".
 */
public class Task1 {
    public static void checkNumberPositive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int number = scanner.nextInt();
        try {
            if (number <= 0) {
                throw new InvalidNumberException("Некорректное число");
            }
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }
    }
}

