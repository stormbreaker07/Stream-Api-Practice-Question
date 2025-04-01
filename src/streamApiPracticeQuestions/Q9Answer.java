package streamApiPracticeQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Q9Answer {

    private static final List<Integer> lt = List.of(1,23,3,2,3,6,5,2,2);

    public static void calculateAverage() {
        double avg = lt
                .stream()
                .collect(Collectors.averagingInt(e -> e));

        System.out.println(avg);
    }
}
