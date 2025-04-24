package streamApiPracticeQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q36Answer {

    public static void countFrequency() {
        String word = "ssiehheifuslekskdowefoi";
        //use LinkedHashMap to preserve order.
        HashMap<String, Long> mp = word
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(c -> c, HashMap::new, Collectors.counting()));

        for(Map.Entry<String, Long> m : mp.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
