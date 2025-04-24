package streamApiPracticeQuestions;

import java.util.stream.Collectors;

public class Q29Answer {

    public static void convertToUppercase() {
        String word = "sdfdsfsd sdf";
        String result = word
                .chars()
                .map(Character::toUpperCase)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
