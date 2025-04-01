package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.stream.Collectors;

public class Q23Answer {

    public static void averageAgeOfMale() {
        double averageAge = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .filter(e -> e.getGender().equals("male"))
                .map(Student::getAge)
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(averageAge);
    }

    public static void averageAgeOfFemale() {
        double averageAge = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .filter(e -> e.getGender().equals("female"))
                .map(Student::getAge)
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(averageAge);
    }
}
