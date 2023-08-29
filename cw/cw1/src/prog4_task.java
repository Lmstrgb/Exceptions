/*Напишите программу, которая запрашивает у пользователя два числа и выводит результат их деления. Если пользователь вводит некорректные данные
        (например, буквы или делитель равен нулю), программа должна выводить сообщение "Ошибка" и просить пользователя ввести числа заново.*/

import java.util.Scanner;

public class prog4_task
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int dividend = 0;
        int divisor = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the dividend: ");
                dividend = scanner.nextInt();

                System.out.print("Enter the divisor: ");
                divisor = scanner.nextInt();

                double result = (double) dividend / divisor;
                System.out.println("Result: " + result);

                validInput = true;  // Введены корректные числа, выходим из цикла
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль недопустимо.");
                scanner.nextLine();  // Очистка буфера ввода
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: введите числа.");
                scanner.nextLine();  // Очистка буфера ввода
            }
        }

        scanner.close();
    }
}
