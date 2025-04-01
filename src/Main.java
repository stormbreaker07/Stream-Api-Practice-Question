import streamApiPracticeQuestions.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer>  lt = Q1Answer.squareListElements();
//        printList(lt);

//        System.out.println(Q3Answer.maxLengthElement());
//        System.out.println(Q4Answer.findTotalDistinctWord() );
//        System.out.println(Q5Answer.concatFirstTwoWord());

        printStringList(Q8Answer.removeDuplicate());
    }

    private static void printIntList(List<Integer> lt) {
        lt.forEach(System.out::println);
    }

    private static void printStringList(List<String> lt) {
        lt.forEach(System.out::println);
    }

}