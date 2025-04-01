package streamApiPracticeQuestions.repository;

import streamApiPracticeQuestions.model.Student;

import java.util.List;

public class ListOfStudents {

    private static ListOfStudents INSTANCE;
    private List<Student> students;

    private ListOfStudents() {
        this.students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "Ranchi", 4),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "Nasik", 4),
                new Student("Anshu", "mishra", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );
    }

    public static ListOfStudents getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ListOfStudents();
        }
        return INSTANCE;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
