package streamApiPracticeQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Q1Answer {

    private static final List<Integer> lt = List.of(1,23,3,2,3,6,5,2,2);

    public static List<Integer> squareListElements() {
        return lt.stream().map(e -> e*e).collect(Collectors.toList());
    }
}
