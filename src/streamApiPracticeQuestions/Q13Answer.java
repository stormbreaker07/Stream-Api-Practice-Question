package streamApiPracticeQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Q13Answer {

    private static final List<String> words = List.of("AppLe", "BaNana", "adATa", "CHEERY", "elderberry", "arvin");

    public static void wordsStartWithA() {
        List<String> lt = words
                .stream()
                .filter(e -> e.startsWith("A") || e.startsWith("a"))
                .collect(Collectors.toList());

        lt.forEach(System.out::println);
    }

}
