package Chapter_6;

public class GenerateRandomCharacter {
    public static char getRandomChar(char from, char to) {
        return (char) (from + Math.random() * (to - from+1));
    }

    public static char getRandomLowerCaseChar(char from, char to) {
        return (char) getRandomChar(from, to);
    }

    public static char getRandomUpperCaseChar(char from, char to) {
        return (char) getRandomChar(from, to);
    }

    public static char getRandomDigit(char from, char to) {
        return (char) getRandomChar(from, to);
    }

    public static void main(String[] args) {
        final int number_of_characters = 256;
        final int number_of_char_per_line = 85;
        for (int i = 0; i < number_of_characters; i++) {
            char ch = getRandomLowerCaseChar('a', 'z');
            if ((i+1) % number_of_char_per_line == 0) {
                System.out.println();
            }else{
                System.out.print(ch);
            }
        }
    }
}
