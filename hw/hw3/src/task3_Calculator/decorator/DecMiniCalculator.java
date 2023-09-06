package task3_Calculator.decorator;

import task3_Calculator.calculatorNormal.Calculable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DecMiniCalculator implements DecoratorCalculator{
    private Calculable calculator;

    public DecMiniCalculator(Calculable calculator) {
        this.calculator = calculator;
    }

    @Override
    public double sum(double arg1, double arg2) {
        double result = calculator.sum(arg1, arg2);
        //log("Сумма: ");
        log(String.format("Мини калькулятор, вычисляется сумма чисел: %s и %s ", arg1, arg2));
        return result;
    }

    @Override
    public double multiply(double arg1, double arg2) {
        double result = calculator.multiply(arg1, arg2);

        log(String.format("Мини калькулятор, вычисляется произведение чисел: %s и %s ", arg1, arg2));
        return result;
    }

    @Override
    public double divide(double arg1, double arg2) throws ArithmeticException {
        if(arg2 == 0) {
            log(String.format("Мини калькулятор, нельзя поделить %s на %s: ", arg1, arg2));
            throw new ArithmeticException("Cannot divide by zero");

        }
        double result = calculator.divide(arg1, arg2);
        log(String.format("Мини калькулятор, вычисляется деление чисела %s на %s: ", arg1, arg2));
        return result;

    }

    @Override
    public double minus(double arg1, double arg2) {
        double result = calculator.minus(arg1, arg2);
        log(String.format("Мини калькулятор, вычисляется разность чисела %s и %s: ", arg1, arg2));
        return result;
    }

    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        log(String.format("Мини калькулятор, вычисляется возведение числа %s в степень %s: ", base, exponent));
        //history.add(base + "^" + exponent + " = " + result);
        return result;
    }

    @Override
    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.printf("%n%s : %s%n",now.format(formatter), message);
    }


}
