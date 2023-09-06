//Задача 2: Файловый менеджер (ООП, исключения)
//
//        Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами: чтение,
//        запись и копирование. Каждый из этих методов должен выбрасывать соответствующее исключение, если в процессе
//        выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).

package task2_FileManager;


import java.io.*;

public class FileManager implements AutoCloseable {
    // Нашёл в интернете, получаем путь до нашей папки task2_FileManger
    private String internalPath = this.getClass().getName().replace(".", File.separator);
    private String externalPath = System.getProperty("user.dir") + File.separator + "src";
    private String workDir = externalPath + File.separator + internalPath.substring(0, internalPath.lastIndexOf(File.separator));
    private String fileName;
    private FileWriter fw;
    private FileReader fr;
    public File file;
    //String absFileName = workDir + File.separator + fileName;
    String fromFile;
    InputStream in;
    OutputStream out;

    public FileManager(String fileName) throws Exception {
        this.fileName = fileName;
        String absFileName = workDir + File.separator + fileName;
        String absFileNameCopy=workDir + File.separator + "copied.txt";
        file = new File(absFileName);
        fw = new FileWriter(absFileName);

        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден " + fileName);
        }
        fr = new FileReader(absFileName);
        in = new FileInputStream(absFileName);
        out = new FileOutputStream(absFileNameCopy);
        StringBuilder fromFile;
    }

    public void write(String content) throws IOException {
        // BufferedWriter writer = new BufferedWriter(fw);
        fw.write(content);
        fw.close();
        System.out.println("Выполнена запись в файл.");
    }

    public String read() throws FileNotFoundException, IOException {


        BufferedReader bfReader = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String line = bfReader.readLine();
        //fr.read();
        sb.append(line);
        while ((line = bfReader.readLine()) != null) {
            sb.append(System.lineSeparator());
            line = bfReader.readLine();
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        System.out.print("Выполнено чтение из файла");
        return sb.toString();
    }

    public void copy() throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден " + fileName);
        }

        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }

    }


    //Должен же быть наш класс АвтоЗакрываемый
    @Override
    public void close() throws Exception {
        fw.close();
        fr.close();
    }
}
