
public class PowerCalculator {
    public static double calculatePower(double base, double exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Возведение нуля в отрицательную степень невозможно");
        }
        return Math.pow(base, exponent);
    }
}

