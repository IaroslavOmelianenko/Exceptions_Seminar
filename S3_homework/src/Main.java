import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            double number1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double number2 = scanner.nextDouble();

            System.out.print("Выберите операцию (+ , - , * , / , ^): ");
            String mathAction = scanner.next();

            switch (mathAction) {
                case "+":
                    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                    break;
                case "-":
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                    break;
                case "*":
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                    break;
                case "/":
                    if (number2 == 0) {
                        throw new ArithmeticException("Деление на ноль невозможно");
                    }
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                    break;
                case "^":
                    double result = PowerCalculator.calculatePower(number1, number2);
                    System.out.println(number1 + " ^ " + number2 + " = " + result);
                    break;
                default:
                    throw new IllegalArgumentException("Ошибка вычисления");
            }

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
