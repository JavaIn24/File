package ClassWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Work {
    public static void main(String[] args) throws IOException {
        String info = "Привет как дела";
        String info1 = "Нормально";
        File file = new File("D://JavaFile/Example1");
        FileWriter writer = new FileWriter(file, true);
        writer.write('\n' + info1);
        writer.close();
    }
}
