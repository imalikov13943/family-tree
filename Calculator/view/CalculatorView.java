package Calculator.view;

import java.util.Scanner;
import Calculator.model.ComplexNumber;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public ComplexNumber getComplexNumber() {
        System.out.print("Введите реальное число: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимое число: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("Результат: " + result);
    }

    public int getOperation() {
        System.out.println("Выберите опперацию: 1. Сложение 2. Умножение 3. Деление");
        return scanner.nextInt();
    }
}
