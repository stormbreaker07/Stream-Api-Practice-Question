package streamApiPracticeQuestions;

import java.util.stream.Collectors;

public class Q28Answer {

    public static void removeWhiteSpace() {
        String word = "sd  w sd e sd fg  e ds";
        //chars() is actually int Stream so when we map it with obj if we dont type cast it to chat it will map ascii
        //value of it.
        String result = word
                .chars()
                .filter(x -> x != ' ')
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
