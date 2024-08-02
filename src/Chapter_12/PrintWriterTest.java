package Chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello World");
            pw.print("I am Md. Alamin");
            pw.println(". I am 27 years old. In the near future I will join in MAANG type industries.");
            pw.write("I wish, I could do so by the help of Almighty Allah SWT.\n");
            pw.write("Final update");
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
