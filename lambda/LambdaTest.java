package lambda;

import java.util.*;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("bbb");
        list.add("CCC");
        list.add("ddd");
        list.add("EEE");
        list.add("fff");

        System.out.println("정렬전");
        printList(list);

        Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("정렬후");
        printList(list);
    }

    public static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }

    /*
     * interface Predicate<T> {
     * boolean test(T t);
     * }
     * 
     * Predicate<Person>
     * 
     * interface Predicate {
     * boolean
     * }
     * 
     * interface Consumer<T> {
     * void accept(T t);
     * }
     * 
     * interface Consumer {
     * void accept(Person t);
     * }
     */
}
