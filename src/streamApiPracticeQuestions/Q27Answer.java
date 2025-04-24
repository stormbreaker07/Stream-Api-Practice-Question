package streamApiPracticeQuestions;

public class Q27Answer {


    public static void NoOfVowels() {
        String word = "soidowsrlksjdo isoei";

        long ans = word
                .chars()
                .filter(x -> "aeiou".indexOf(x) != -1)
                .count();

        System.out.println(ans);
    }
}
