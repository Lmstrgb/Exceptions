package task3;

public class DivisionByZeroException extends Exception{
    private double n3;


    public DivisionByZeroException(String message, double n3) {
        super(message);
        this.n3 = n3;
    }

    public double getN3() {
        return n3;
    }

    public String getErrorDetails() {
        return "Третье число: " + n3;
    }
}
