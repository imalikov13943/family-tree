package Calculator.presenter;

import Calculator.logger.Logger;
import Calculator.model.ComplexNumber;
import Calculator.view.CalculatorView;

public class CalculatorPresenter {
    private CalculatorView view;
    private Logger logger;

    public CalculatorPresenter(CalculatorView view, Logger logger) {
        this.view = view;
        this.logger = logger;
    }

    public void performOperation() {
        ComplexNumber number1 = view.getComplexNumber();
        ComplexNumber number2 = view.getComplexNumber();
        ComplexNumber result = null;

        int operation = view.getOperation();
        switch (operation) {
            case 1:
                result = number1.add(number2);
                logger.log("Выполненное сложение: " + number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = number1.multiply(number2);
                logger.log("Выполненное умножение: " + number1 + " * " + number2 + " = " + result);
                break;
            case 3:
                result = number1.divide(number2);
                logger.log("Выполненное деление: " + number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Неверная опперация.");
                return;
        }
        view.displayResult(result);
    }
}

