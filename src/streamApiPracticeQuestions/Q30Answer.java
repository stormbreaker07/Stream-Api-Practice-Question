package streamApiPracticeQuestions;

import java.util.Collections;
import java.util.stream.Collectors;

public class Q30Answer {

    public static void reverseString() {

        String word = "Ghost of Tshusima";
        String result = new StringBuilder(word)
                .reverse()
                .toString();
    }

    public static void reverseString1() {

        String word = "Ghost of Tshusima";
        String result = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                    Collections.reverse(lst);
                    return lst.stream();
                }))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);

    }
}
