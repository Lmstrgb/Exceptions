package task3;

public class NumberOutOfRangeException extends RuntimeException {
    private double n1;
    private double n2;

    public NumberOutOfRangeException(String message, double n1, double n2) {
        super(message);
        this.n1=n1;
        this.n2=n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public String getErrorDetails() {
        return "Первое число: " + n1 + ", Второе число: " + n2;
    }



}
