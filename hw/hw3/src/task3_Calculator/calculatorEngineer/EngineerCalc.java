package task3_Calculator.calculatorEngineer;

import task3_Calculator.calculatorNormal.Calculable;

public class EngineerCalc implements Calculable {
    @Override
    public double sum(double arg1, double arg2) {
        System.out.println(":) А теперь считаем по инженерному: ");
        return arg1 + arg2;
    }

    @Override
    public double multiply(double arg1, double arg2) {
        System.out.println(" :) А теперь считаем по инженерному: ");
        return arg1 * arg2;
    }

    @Override
    public double divide(double arg1, double arg2) {
        System.out.println(" :) А теперь считаем по инженерному: ");
        if (arg2 == 0) {
            throw new ArithmeticException("Деление на ноль даже в инженерном режиме запрещено");
        }
        return arg1 / arg2;
    }

    @Override
    public double minus(double arg1, double arg2) {
        System.out.println(":) А теперь считаем по инженерному:");
        return arg1-arg2;
    }

    @Override
    public double power(double a, double b) {
        System.out.println("В инженерном калькуляторе метод не реализован, только в мини версии");
        return 0;
    }
}
