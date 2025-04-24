package streamApiPracticeQuestions;

import java.util.stream.Collectors;

public class Q31Answer {

    public static void replaceVowels() {
        String word = "aosruehjsoowne";

        String ans = word
                .chars()
                .mapToObj(c -> "aeiou".indexOf(Character.toLowerCase(c)) != -1 ? "*" : String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(ans);
    }
}
