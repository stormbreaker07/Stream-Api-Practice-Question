package streamApiPracticeQuestions;

import streamApiPracticeQuestions.model.Student;
import streamApiPracticeQuestions.repository.ListOfStudents;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q21Answer {

    public static void findStudentFromEachDep() {

        Map<String, List<Student>> mp = ListOfStudents.getInstance().getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getDepartmentName()));

        mp.forEach((depName, list) -> {
            System.out.println(depName);
            list.forEach(System.out::println);
            System.out.println();
        });
    }
}
