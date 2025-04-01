package streamApiPracticeQuestions;

import java.util.Comparator;
import java.util.List;

public class Q16Answer {

    private static final List<Integer> lt = List.of(1,23,3,2,3,6,5,2,2);

    public void findSecondSmallest() {
        int value = lt.stream().sorted().skip(1).findFirst().orElse(Integer.MAX_VALUE);
    }

    public void findSecondLargest() {
        int value = lt.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(Integer.MIN_VALUE);
    }
}
