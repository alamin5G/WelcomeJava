package java384class.string_manipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.out;

public class TextEditor {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        out.println("Enter your text: ");
        String line = br.readLine();

        StringBuilder builder = new StringBuilder();

        builder.append(line);
        String[] words = builder.toString().split(" ");

        builder.replace(3, 3, " A");
        out.println(builder);
        builder.reverse();
        out.println(builder);
        out.println(Arrays.toString(words));

        out.flush();
    }
}
