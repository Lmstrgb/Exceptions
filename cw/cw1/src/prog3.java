public class prog3 {

    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException caught: " + exception.getMessage());
            System.out.println(exception);
            exception.printStackTrace();
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
