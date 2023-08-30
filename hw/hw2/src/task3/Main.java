/*Задача3: - по желанию
        Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

        Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число
        вне допустимого диапазона". Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
        "Второе число вне допустимого диапазона". Если сумма первого и второго чисел меньше 10, выбросить исключение
        NumberSumException с сообщением "Сумма первого и второго чисел слишком мала". Если третье число равно 0,
        выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
        В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
        - необходимо создать 3 класса собвстенных исключений*/

package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num3 = scanner.nextDouble();
        scanner.close();

        CheckerNumbers checkNum = new CheckerNumbers();
        int count = 0;
        try {
            if (checkNum.checkOne(num1, num2)) {
                System.out.println("Проверка № 1 пройдена: " + "первое число = " + num1 + " ,а второе = " + num2);
                count++;
            }
        } catch (NumberOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error details: " + e.getErrorDetails());
        }

        try {
            if (checkNum.checkTwo(num1, num2)) {
                System.out.println("Проверка № 2 пройдена: " + "первое число = " + num1 + " ,а второе = " + num2);
                count++;
            }
        } catch (NumberSumException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error details: " + e.getErrorDetails());
        }


        try {
            if (checkNum.checkThree(num3)) {
                System.out.println("Проверка № 3 пройдена, число три не равно 0, оно = " + num3);
                count++;
            }
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error details: " + e.getErrorDetails());
        }
        //какой то костыль с этим count, но по-другому не догадался как сделать
        if (count == 3) {
            System.out.println("Проверка пройдена успешно");
        }


    }
}
