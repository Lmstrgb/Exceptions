
public class Main {
    public static void main(String[] args) {
        //task 1
        /*int nums[] = new int[4];

        try {
            System.out.println("message1");
            nums[8] = 10;
            System.out.println("message2");
        } catch (Exception exception) {
            System.out.println("SuperMessage");
        }
        System.out.println("message5");
    */
        //task 2
        int[] num1 = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] num2 = { 2, 0, 4, 4, 0, 8 };

        try {
            for (int i = 0; i < num1.length; i++) {
                try {
                    System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
                } catch (ArithmeticException exception) {
                    System.out.println("Trying to divide by zero.");
                }
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Index is out if bounds.");
        }

    }


}