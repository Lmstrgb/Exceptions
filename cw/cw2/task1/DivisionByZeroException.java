// Класс исключения для деления на ноль
package task1;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}