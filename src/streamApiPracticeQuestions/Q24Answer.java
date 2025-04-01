package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q24Answer {

    public static void maxStudentDepName() throws Exception {
        Map<String, Long> groupByDepartment = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));

        Map.Entry<String, Long> ans = groupByDepartment
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new Exception("No data"));

        System.out.println(ans);
    }
}
