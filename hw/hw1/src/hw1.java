
import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }

    public static class Answer {
        public void arrayOutOfBoundsException() {
            // Напишите свое решение ниже
            int[] num1 = {4, 8, 16, 32, 64, 128, 256, 512};
            int[] num2 = {2, 1, 4, 4, 1, 8};


            for (int i = 0; i < num1.length; i++) {
                System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
            }
        }

        public static void divisionByZero() {
            // Напишите свое решение ниже
            int numerator = 10;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        }

        public void numberFormatException() {
            // Напишите свое решение ниже

            String str = "kj";
            int num = Integer.parseInt(str); // результат: 123


        }
    }
}






