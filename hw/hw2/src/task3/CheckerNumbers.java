package task3;

public class CheckerNumbers {
    public boolean checkOne(double n1, double n2) throws NumberOutOfRangeException {
        if (n1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона", n1, n2);
        }

        if (n2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона", n1, n2);
        }

        return true;
    }

    public boolean checkTwo(double n1, double n2) throws NumberSumException {
        if (n1 + n2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала", n1, n2);
        }
        return true;
    }

    public boolean checkThree(double n3) throws DivisionByZeroException {
        if (n3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо", n3);
        }
        return true;
    }
}
