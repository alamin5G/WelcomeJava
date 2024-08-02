package Chapter_12;

import java.io.*;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        File file = new File("read_from_file.txt");
        if (!file.exists()) {
            System.out.println("File does not exist");
            file = new File("read_from_file.txt");
            System.out.println("File created!");
        }


        //first input some data from print writer to the file
        try(PrintWriter writer = new PrintWriter(file)) {
            writer.write("Hello World");
            writer.println("! You know I am a programmer.");
            writer.println("So, why do you fear to your age?");
            writer.println("I am 27 years old.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Read from file using Scanner class: ");
        //one method to read from file
        try {
            Scanner input = new Scanner(new File(file.toURI()));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println();
        System.out.println("Read from file using FileReader class: ");
        System.out.println();
        //second method to read form a file
        try(FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
