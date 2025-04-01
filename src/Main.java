import streamApiPracticeQuestions.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

//        List<Integer>  lt = Q1Answer.squareListElements();
//        printList(lt);

//        System.out.println(Q3Answer.maxLengthElement());
//        System.out.println(Q4Answer.findTotalDistinctWord() );
//        System.out.println(Q5Answer.concatFirstTwoWord());

//        printStringList(Q8Answer.removeDuplicate());
//        Q10Answer.convertToLowercase();
//        Q10Answer.convertToUppercase();
//        Q9Answer.calculateAverage();
//        Q13Answer.wordsStartWithA();
//        Q14Answer.sortListAsc();
//        Q14Answer.sortListDesc();
//        Q19Answer.StudentFirstNameStartWithA();
//        Q21Answer.findStudentFromEachDep();
//        Q23Answer.averageAgeOfMale();
//        Q24Answer.maxStudentDepName();
        Q25Answer.filterStudents();
    }

    private static void printIntList(List<Integer> lt) {
        lt.forEach(System.out::println);
    }

    private static void printStringList(List<String> lt) {
        lt.forEach(System.out::println);
    }

}