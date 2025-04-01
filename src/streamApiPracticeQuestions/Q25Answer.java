package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.List;

public class Q25Answer {
    //Find the Students who stays in Ranchi and sort them by their names.

    public static void filterStudents() {

        List<Student> lt = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .filter((student) -> student.getCity().equals("Ranchi"))
                .sorted((a, b) -> a.getFirstName().compareTo(b.getFirstName()))
                .toList();

        lt.forEach(System.out::println);
    }
}
