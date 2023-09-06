package task3_Calculator.calculatorNormal;

import java.util.Scanner;

public class ViewCalc {
    private Calculable calculator;
    Scanner scanner = new Scanner(System.in);

    boolean exit = false;

    public ViewCalc(Calculable calculator) {
        this.calculator = calculator;
    }


    public void run() {
        while (!exit) {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Выберите операцию (+, *, -, /, ^): ");
            String operator = scanner.next();
            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();

            double result = 0;
            switch (operator) {
                case "+":
                    result = calculator.sum(a, b);
                    break;
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "/":
                    try {
                        result = calculator.divide(a, b);
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("Исключение в мини калькуляторе, делить на ноль нельзя / " + e.getMessage());
                    }
                    break;
                case "-":
                    result = calculator.minus(a, b);
                    break;
                case "^":
                    result = calculator.power(a, b);
                    break;
                default:
                    System.out.println("Некорректная операция");
                    continue;
            }
            System.out.println("Результат: " + result);
            System.out.println("Хотите выйти? (y/n)");
            if (scanner.next().equalsIgnoreCase("y")) {
                exit = true;
            }
            //scanner.close();
        }
    }
}

