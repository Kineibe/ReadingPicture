import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Neikila on 19.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        byte[] bytesFromFile = null;        // Переменная для хранения массива байт
        String filename = "Bugreport.png";  // Путь до файла из корня

        try {
            // Получение массива байт из картинки
            bytesFromFile = Files.readAllBytes(Paths.get(filename));

            // Вывод в консоль массива байт, если убрать "(char)", то увидишь просто поток цифр.
            // В консоли картинки ты никак не получишь.
            for (int i = 0; i < bytesFromFile.length; ++i) {
                System.out.print((char)bytesFromFile[i]);
            }

            // Запись в НОВЫЙ файл путь до которого someFile.png
            FileOutputStream fos = new FileOutputStream(new File("someFile.png"));
            fos.write(bytesFromFile);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
