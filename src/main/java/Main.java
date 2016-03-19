import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Neikila on 19.03.2016.
 */
public class Main {

    public static void main(String[] args) {

//        byte a = -127;

        List<Boolean> positive = new ArrayList<Boolean>();
        // Допустим у нас есть 00111110 = 62
        positive.add(false);
        positive.add(true);
        positive.add(true);
        positive.add(true);
        positive.add(true);
        positive.add(true);
        positive.add(false);
        positive.add(false);

        perevod2v10(positive);
    }

    public static int perevod2v10(List<Boolean> list) {
        int a = 0;
        for (int i = 0; i < list.size() && i < 8; ++i) {
            if (list.get(i))
                a = a | (1 << i);
        }

        System.out.println(a);
        return a;
    }
}
