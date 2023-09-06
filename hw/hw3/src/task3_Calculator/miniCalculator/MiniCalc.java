package task3_Calculator.miniCalculator;

import task3_Calculator.calculatorNormal.Calculable;

public class MiniCalc implements Calculable {

    @Override
    public double sum(double arg1, double arg2) {
        double result = arg1 + arg2;
        //history.add(num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public double multiply(double arg1, double arg2) {
        double result = arg1 * arg2;
        //history.add(num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public double divide(double arg1, double arg2) throws ArithmeticException {
        if(arg2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = arg1 / arg2;
       // history.add(num1 + " / " + num2 + " = " + result);
        return result;
    }

    @Override
    public double minus(double arg1, double arg2) {
        double result = arg1 - arg2;
        //history.add(num1 + " - " + num2 + " = " + result);
        return result;
    }

   // @Override
    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        //history.add(base + "^" + exponent + " = " + result);
        return result;
    }
}
