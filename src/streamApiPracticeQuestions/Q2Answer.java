package streamApiPracticeQuestions;

import java.util.Comparator;
import java.util.List;

public class Q2Answer {

    private static final List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eva");

    public static int maxLengthElement() {
        return names
                .stream()
                .map(e -> e.length())
                .reduce(Integer::max)
                .get();
    }
}
