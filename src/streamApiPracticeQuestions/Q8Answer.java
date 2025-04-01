package streamApiPracticeQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Q8Answer {

    private static final List<String> words = List.of("apple", "banana", "date", "cherry", "apple", "date", "elderberry");

    public static List<String> removeDuplicate() {
        return words
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
