package streamApiPracticeQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Q3Answer {

    private static final List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eva");

    //it will first map string with its length if 2 more string have same length so we get only
    //unique length, sort them, reduce it
    public static int maxLength() {
        Optional<Integer> ans =  names
                .stream()
                .map(String::length)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        return ans.orElse(-1);
    }

    public static String maxLengthElement() {
        return names
                .stream()
                .sorted((a,b) -> Integer.compare(b.length(),a.length()))
                .skip(1)
                .findFirst()
                .orElse("No string");


    }


}
