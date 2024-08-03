package Chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromUrl {
    public static void main(String[] args) {
        System.out.println("Enter a URL to read from: ");
        String  urlLink = new Scanner(System.in).next();
        System.out.println("Read File from URL: " + urlLink);




        try {
            File file = new File("urlLink.txt");

            PrintWriter writer = new PrintWriter(file);

            URL url = new URL(urlLink);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                writer.println(line);
                count += line.length();

            }

            System.out.println("The file has " + count + " characters");
            
        } catch (MalformedURLException e) {
            System.err.println("No URL found");
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }

    }
}
