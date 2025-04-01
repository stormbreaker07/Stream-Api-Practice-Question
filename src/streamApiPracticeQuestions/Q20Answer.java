package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.List;

public class Q20Answer {

    public static void StudentFirstNameEndWithU() {
        List<Student> lt = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .filter(e -> e.getFirstName().endsWith("u"))
                .toList();

        lt.forEach(System.out::println);
    }
}
