/*Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

        Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает
        строку пароля и проверяет его на соответствие следующим правилам:

        Пароль должен быть не менее 8 символов.
        Пароль должен содержать хотя бы одну цифру.
        Пароль должен содержать хотя бы одну заглавную букву.
        Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.*/

package task1;

import java.util.Scanner;

public class PasswordVerifier {

    boolean hasDigit, hasUpperCase = false;

    public static void main(String[] args) {
        PasswordVerifier pass = new PasswordVerifier();
        try {
            pass.verifyPassword();
        } catch (PswWrongException e) {
            System.out.println("Получили следующее исключение: " + e.getMessage());
        }

    }

    public void verifyPassword() throws PswWrongException {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите пароль из 8 символов: ");
            String psw = sc.nextLine();
            char[] pswArr = psw.toCharArray();
            if (pswArr.length < 8) {
                throw new PswWrongException("Пароль должен содержать 8 символов");
            } else {
                for (char c : pswArr) {
                    if (Character.isDigit(c)) {
                        hasDigit = true;
                    }
                    if (Character.isUpperCase(c)) {
                        hasUpperCase = true;
                    }
                    if (hasDigit & hasUpperCase) {
                        break;
                    }
                }
                if (!hasDigit) {
                    throw new PswWrongException("Пароль должен содержать хотя бы одну цифру");
                }

                if (!hasUpperCase) {
                    throw new PswWrongException("Пароль должен содержать хотя бы одну заглавную букву");
                }

            }
        }
        System.out.println("Пароль соответствует требованиям.");
    }
}