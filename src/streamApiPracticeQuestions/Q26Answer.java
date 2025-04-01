package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q26Answer {
    //Find the highest rank in each department
    public static void highestRankPerDepartment() {
        Map<String, Optional<Student>> mp = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.maxBy(Comparator.comparingInt(Student::getRank))));

        mp.entrySet().forEach(System.out::println);
    }
}
