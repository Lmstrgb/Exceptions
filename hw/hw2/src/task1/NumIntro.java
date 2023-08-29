
//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с
//        сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

package task1;

import java.util.Scanner;

public class NumIntro {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int num1 = scanner.nextInt();
        scanner.close();

        try {
            if (num1 <= 0) {
                throw new InvalidNumberException("Некорректное число");
            } else {
                System.out.println("Число корректно");
            }

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }

    }

}

