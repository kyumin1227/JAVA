package lambda;

import java.time.LocalDate;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("고길동", LocalDate.of(2000, 1, 4), "gdhong@gmail.com", Sex.MALE);
        Person p2 = new Person("둘리", LocalDate.of(1995, 2, 12), "gmil@gmail.com", Sex.MALE);
        Person p3 = new Person("또치", LocalDate.of(1988, 5, 31), "gdhong@gmail.com", Sex.FEMALE);

        // List는 인터페이스, 이 인터페이스를 구현하는 클래스로 ArrayList, LinkedList 등이 있다.
        List<Person> list = new ArrayList<>(0);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        printPersonWithinAgeRange(list, 28, 35);

        // printPersons(list, new CheckPerson() {
        // public boolean test(Person P) {
        // return P.getGender() == Sex.MALE;
        // }
        // });

        // 람다식은 이름없는 메소드라 할 수 있다.
        // 람다식을 이용하는 이유는 간결하기 때문이다.
        // 람다식을 이용하는 메소드가 필요한 곳에 간단히 메소드를 보낼 수 있다.
        // 람다식은 함수형 프로그래밍을 자바에 도입한 것이다.
        // 람다식은 오직 하나의 추상 메소드를 가지는 인터페이스 타입의 객체를 요구하는 메소드의 인자로 전달될 수 있다.2222
        // 람다식의 문법
        // (arg1, arg2, ...) -> { body }
        // (type1 arg1, type2 arg2, ...) -> { body }

        // 위의 무명클래스를 람다식으로 구현해보자.
        // printPerson(list, (p) -> {
        // return p.getGender() == Sex.MALE;
        // });

        // 람다식의 body가 return문 하나만으로 구성되어 있으면 return 키워드, {}, 문장 끝의 세미콜론(;)도 생략할 수 있다.

        // 람다식을 이용해서 printPersons 메소드를 호출하고,
        // 그 결과로 나이 20에서 30살 사이의 여자만 출력되도록 구현하라.

        printPersons(list, (p) -> {
            return p.getAge() >= 20 && p.getAge() <= 30 && p.getGender() == Sex.FEMALE;
        });
    }

    // collection framework : List, Set, Map, Stack, Queue
    // collection framework는 여러개의 값을 저장하는 자바의 자료구조
    // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다.
    // List<Person>, Set<Integer>, Map<String, Person>, ...
    public static void printPersonOlderThan(List<Person> persons, int age) {

        // persons 리스트의 각 원소에 대해서 반복문을 수행한다.
        // 각 원소를 Person 타입의 변수 p에 저장.
        for (Person p : persons) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    // List<Person> list, int low, int high
    // 위 세개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(low 이상, high 미만)를
    // 입력으로 받아, 저 나이 범위의 Person 정보만 출력하는 메소드
    // printPersonWithinAgeRange를 구현

    public static void printPersonWithinAgeRange(List<Person> list, int low, int high) {
        for (Person p : list) {
            if (p.getAge() >= low && p.getAge() < high) {
                p.printPerson();
                System.out.println();
            }
        }
    }

    // Person 객체의 리스트와 CheckPerson 인터페이스를 구현한 객체(tester)를 전달받고,
    // 리스트의 각 Person 객체를 tester.test 메소트의 인자로 전달해, 그 반환 값이 true이면
    // 그 Person 객체의 정보를 출력.
    public static void printPersons(List<Person> list, CheckPerson tester) {
        for (Person p : list) {
            if (tester.test(p)) {
                p.printPerson();
                System.out.println();
            }
        }
    }

}

interface CheckPerson {
    boolean test(Person P);
}

// CheckPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
// printPersons 메소드를 호출해라.
// 단, 이 메소드의 의해 출력되는 Person 객체는 성별이 남자인 객체이어야 한다.
class PrintPersonOnlyMan implements CheckPerson {
    @Override
    public boolean test(Person P) {
        return P.getGender() == Sex.MALE;
    }

}