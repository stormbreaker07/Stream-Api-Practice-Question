package streamApiPracticeQuestions;

import java.util.List;

public class Q15Answer {

    private static final List<Integer> lt = List.of(1,23,3,2,3,6,5,2,2);

    public void findMin() {
        int min = lt.stream().reduce(Integer::min).get();
        System.out.println(min);
    }

    public void findMax() {
        int max = lt.stream().reduce(Integer::max).get();
        System.out.println(max);
    }
}
