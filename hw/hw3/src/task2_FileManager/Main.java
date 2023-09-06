package task2_FileManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try (FileManager fm = new FileManager("sample.txt")) {
            //fm.write("Первая запись. Вторая запись ");
            fm.fromFile = fm.read();
            System.out.print(",содержимое: " + fm.fromFile);
           fm.copy();


        } catch (FileNotFoundException e) {
            System.err.println("Исключение FileNotFoundException:" + e.getMessage());
            //throw new FileNotFoundException(e);
        } catch (IOException e) {
            System.err.println("Исключение IOException:" + e.getMessage());
            //throw new RuntimeException(e);
        }

    }
}
