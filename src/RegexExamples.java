import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static void main(String[] args) {

        // 1. x - specified character
        testRegex("Java", "Java");

        // 2. . - any single character
        testRegex("J..a", "Java");

        // 3. (ab|cd) - matches "ab" or "cd"
        testRegex("t(en|im)", "tepn");

        // 4. [abc] - any one of 'a', 'b', or 'c'
        testRegex("Ja[uvwx]a", "Java");

        // 5. [^abc] - any character except 'a', 'b', or 'c'
        testRegex("Ja[^arvs]a", "Java");

        // 6. [a-z] - a through z
        testRegex("[A-M]av[b-d]", "Javc");

        // 7. [^a-z] - any character except a through z
        testRegex("Jav[^b-d]", "Jave");

        // 8. [a-e[m-p]] - a through e or m through p
        testRegex("[A-G[I-M]]av[a-d]", "Javb");

        // 9. [a-e&&[c-p]] - intersection of a-e and c-p
        testRegex("[A-P&&[I-M]]av[a-d]", "Iavb");

        // 10. \d - any digit
        testRegex("Java\\d", "Java2");

        // 11. \D - any non-digit
        testRegex("\\D\\Dava", "$Java");

        // 12. \w - any word character (alphanumeric + underscore)
        testRegex("\\wava\\d", "Java1");

        // 13. \W - any non-word character
        testRegex("\\W\\wava", "$Java");

        // 14. \s - any whitespace character
        testRegex("Java\\s2", "Java 2");

        // 15. \S - any non-whitespace character
        testRegex("\\Sava", "Java");

        // 16. p* - zero or more occurrences of pattern "a"
        testRegex("a*", "aaaa");

        // 17. p* - zero or more occurrences of pattern "ab"
        testRegex("(ab)*", "abab");

        // 18. p+ - one or more occurrences of pattern "a"
        testRegex("a+b*", "a");

        // 19. p+ - one or more occurrences of pattern "ab"
        testRegex("(ab)+.*", "able");

        // 20. p? - zero or one occurrence of pattern "J"
        testRegex("J?Java", "Java");

        // 21. p? - zero or one occurrence of pattern "J"
        testRegex("J?ava", "ava");

        // 22. p{n} - exactly n occurrences of "a"
        testRegex("Ja{1}.*", "Java");

        // 23. p{n,} - at least n occurrences of "a"
        testRegex("a{1,}", "aaaa");

        // 24. p{n,m} - between n and m occurrences of "a"
        testRegex("a{1,9}", "aaaa");

        // 25. \p{P} - any punctuation character
        testRegex("J\\p{P}a", "J?a");
    }

    private static void testRegex(String regex, String input) {
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(input);
        System.out.println("Pattern: \"" + regex + "\" on input \"" + input + "\" - " + (matcher.matches() ? "Matched" : "Did not match"));
    }
}
