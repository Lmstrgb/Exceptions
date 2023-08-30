
//Задача 2:
//        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//        Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением
//        "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
//
//        Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса
//        Exception. Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для
//        последующей обработки.

package task2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое положительное число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе положительное число: ");
        double num2 = scanner.nextDouble();

        try {
            if (num2 == 0) {
                throw new DivisionByZeroException("Делитель равен 0");
            }

            System.out.print("Выберите операцию (/ для деления): ");
            char operation = scanner.next().charAt(0);

            if (operation == '/') {
                System.out.println("Результат деления = " + (num1 / num2));
            } else {
                System.out.println("Введите операцию деления / и попробуйте заново ");
            }

        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

