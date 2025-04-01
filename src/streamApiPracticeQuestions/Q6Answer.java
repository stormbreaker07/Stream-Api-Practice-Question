package streamApiPracticeQuestions;

import java.util.List;

public class Q6Answer {

    private static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static int squareSum() {
        return numbers
                .stream()
                .map(e -> e*e)
                .reduce(Integer::sum)
                .get();
    }
}
