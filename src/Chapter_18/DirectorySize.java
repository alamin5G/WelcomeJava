package Chapter_18;

import java.io.File;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) {
        System.out.print("Enter a directory location: ");
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();
        long size = getSize(new File(dir));

        Format fmt = new DecimalFormat("0.00");

        System.out.println(size + " bytes");
        System.out.println(size/1024L + " KB");
        System.out.println( fmt.format(((size/1024L)/1024L)) + " MB");
    }

    public static long getSize(File f) {
        long size = 0;
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                size += getSize(files[i]);
            }
        }else {
            size += f.length();
        }
        return size;
    }
}
