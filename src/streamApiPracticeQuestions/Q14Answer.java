package streamApiPracticeQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q14Answer {

    private static final List<String> words = List.of("AppLe", "BaNana", "adATa", "CHEERY", "elderberry", "arvin");

    public static void sortListAsc() {

        List<String> lt = words
                .stream()
                .map(String::toLowerCase)
                .sorted()
                .toList();

        lt.forEach(System.out::println);
    }

    public static void sortListDesc() {
        List<String> lt = words
                .stream()
                .map(String::toLowerCase)
                .sorted(Comparator.reverseOrder())
                .toList();

        lt.forEach(System.out::println);
    }

}
