import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Neikila on 19.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        byte[] bytesFromFile = null;
        String filename = "Bugreport.png";

        try {
            bytesFromFile = Files.readAllBytes(Paths.get(filename));

            for (int i = 0; i < bytesFromFile.length; ++i) {
                System.out.print((char)bytesFromFile[i]);
            }

            FileOutputStream fos = new FileOutputStream(new File("someFile.png"));
            fos.write(bytesFromFile);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
