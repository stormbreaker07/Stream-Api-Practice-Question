package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

public class Q22Answer {

    public static void maxAge() {
        int age = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .map(Student::getAge)
                .reduce(Integer::max)
                .orElse(-1);

    }

    public static void highestRank() {
        int highestRank = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .map(Student::getRank)
                .reduce(Integer::max)
                .orElse(-1);
    }
}
