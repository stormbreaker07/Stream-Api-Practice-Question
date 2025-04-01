package streamApiPracticeQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Q5Answer {

    private static List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");

    public static String concatFirstTwoWord() {
        return words
                .stream()
                .filter(e -> e.length()%2==0)
                .limit(2)
                .reduce(String::concat)
                .get();
    }

    public static String concatFirstTwoWord1() {
        return words
                .stream()
                .filter(e -> e.length()%2==0)
                .limit(2)
                .collect(Collectors.joining());
    }

}
