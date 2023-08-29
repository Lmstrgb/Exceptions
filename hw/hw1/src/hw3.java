/*Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый
        массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
        Если длины массивов не равны - верните нулевой массив длины 1.
        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
        т.е. ваше.

        Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
        int[] a - первый массив
        int[] b - второй массив*/


import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 4, 4, };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }

    public static class Answer {
        public int[] divArrays(int[] a, int[] b) {
            // Введите свое решение ниже
            try {
                int mass[] = a;
                int mass2[] = b;
                int massRes[] = new int[mass.length];
                if (mass.length != mass2.length) {
                    throw new RuntimeException("Division by zero");
                } else {
                    for (int i = 0; i < mass.length; i++) {
                        massRes[i] = mass[i] / mass2[i];
                    }
                    return massRes;
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                return new int[]{0};
            }


        }
    }
}
