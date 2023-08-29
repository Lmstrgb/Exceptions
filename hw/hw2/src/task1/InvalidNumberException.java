package task1;



// Класс исключения для отрицательных чисел
class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String message) {
        super(message);
    }
}
