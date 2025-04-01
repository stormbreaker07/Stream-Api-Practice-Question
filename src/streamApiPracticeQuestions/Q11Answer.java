package streamApiPracticeQuestions;

import java.util.List;

public class Q11Answer {

    private static final List<Integer> lt = List.of(1,23,3,2,3,6,5,2,2);

    public static void calculateSum() {
        int evenSum = lt.stream().filter(e -> e%2==0).reduce(Integer::sum).get();
        System.out.println(evenSum);
        int oddSum = lt.stream().filter(e -> e%2 == 1).reduce(Integer::sum).get();
    }
}
