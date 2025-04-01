package streamApiPracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Q4Answer {

    private static final List<String> sentences = List.of(
            "Java Stream API provides a fluent interface for processing sequences of elements.",
            "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
            "In this exercise, you need to count the total number of words in all sentences."
    );

    public static long findTotalDistinctWord() {
        return sentences
                .stream()
                .map(e -> e.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count();
    }
}
