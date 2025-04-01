package streamApiPracticeQuestions;

import java.util.List;

public class Q18Answer {

    private static final List<String> words = List.of("AppLe", "BaNana", "adATa", "CHEERY", "elderberry", "arvin");

    public void findWordLongerThanFive() {
        List<String> lt = words
                .stream()
                .filter(e -> e.length() > 5)
                .toList();

        lt.forEach(System.out::println);
    }
}
