package streamApiPracticeQuestions.model;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String departmentName;
    private final int joinedYear;
    private final String city;
    private final int rank;

    public Student(String firstName, String lastName, int age, String gender, String departmentName, int joinedYear, String city, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmentName = departmentName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public String getCity() {
        return city;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", joinedYear=" + joinedYear +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                '}';
    }
}
