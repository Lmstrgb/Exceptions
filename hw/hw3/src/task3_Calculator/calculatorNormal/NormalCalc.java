package task3_Calculator.calculatorNormal;

public class NormalCalc implements Calculable {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }
    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double power(double a, double b) {
        System.out.println("В обычном калькуляторе метод не реализован, только с мини версии");
        return 0;
    }
}
