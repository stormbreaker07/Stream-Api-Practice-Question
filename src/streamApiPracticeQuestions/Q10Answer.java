package streamApiPracticeQuestions;

import java.util.List;

public class Q10Answer {

    private static final List<String> words = List.of("AppLe", "BaNana", "dATe", "CHEERY", "elderberry");

    public static void convertToUppercase() {
        List<String> upperCaseWords = words
                .stream()
                .map(String::toUpperCase)
                .toList();

        upperCaseWords.forEach(System.out::println);
    }

    public static void convertToLowercase() {
        List<String> lowerCaseWords = words
                .stream()
                .map(String::toLowerCase)
                .toList();

        lowerCaseWords.forEach(System.out::println);
    }

}
