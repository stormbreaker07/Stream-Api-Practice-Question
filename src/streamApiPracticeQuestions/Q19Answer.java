package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.List;

public class Q19Answer {

    public static void StudentFirstNameStartWithA() {
        List<Student> lt = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .filter(e -> e.getFirstName().startsWith("A"))
                .toList();

        lt.forEach(System.out::println);
    }
}
