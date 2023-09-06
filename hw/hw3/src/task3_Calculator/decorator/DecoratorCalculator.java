package task3_Calculator.decorator;

import task3_Calculator.calculatorNormal.Calculable;

public interface DecoratorCalculator extends Calculable {
    public void log(String message);
}
