package streamApiPracticeQuestions;

import java.util.List;

public class Q17Answer {

    private static final List<String> words = List.of("AppLe", "BaNana", "adATa", "CHEERY", "elderberry", "arvin");

    public void findFirstElement() {
        String firstWord = words.stream().findFirst().orElse("empty list");
        System.out.println(firstWord);
    }
}
