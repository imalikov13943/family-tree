package Calculator;

import Calculator.logger.Logger;
import Calculator.presenter.CalculatorPresenter;
import Calculator.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        Logger logger = new Logger();
        CalculatorPresenter presenter = new CalculatorPresenter(view, logger);

        presenter.performOperation();
    }
}
