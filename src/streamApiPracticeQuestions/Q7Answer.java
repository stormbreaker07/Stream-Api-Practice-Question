package streamApiPracticeQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q7Answer {

    private static final List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");

    public Map<Integer, List<String>> mapWordWithLength() {
        return words
                .stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
