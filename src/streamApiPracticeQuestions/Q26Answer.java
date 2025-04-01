package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.stream.Collectors;

public class Q26Answer {
    //Find the highest rank in each department
    public static void highestRankPerDepartment() {
        ListOfStudents.getInstance().getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.maxBy(Student::getRank)))
    }
}
