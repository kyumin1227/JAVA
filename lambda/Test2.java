package lambda;

import java.util.*;
import java.time.LocalDate;
import java.util.function.*;

public class Test2 {
    public static void main(String[] args) {
        /*
         * 1. Person 객체를 5개 이상 생성해 ArrayList에 저장하시오.
         * 2. printGender 메소드를 호출하시오.
         * 가. printGender 메소드는 1번에서 생성한 ArrayList의 각 원소에 대해 그 원소가 남자이면 "OOO은 남자입니다.", 그
         * 원소가 여자이면 "OOO은 여자입니다." 를 출력한다.
         * 3. 구현해보시오.
         * 가. printGender 메소드를 호출할 때, CheckPerson 객체를 인자로 넘겨줘야 하는데, 그 객체가 남자인지 여자인지를
         * 판단해서 남자이면 true를 여자이면 false를 반환한다.
         */

        Person p1 = new Person("고길동", LocalDate.of(2000, 1, 4), "gdhong@gmail.com", Sex.MALE);
        Person p2 = new Person("둘리", LocalDate.of(1995, 2, 12), "gmil@gmail.com", Sex.MALE);
        Person p3 = new Person("또치", LocalDate.of(1988, 5, 31), "gdhong@gmail.com", Sex.FEMALE);
        Person p4 = new Person("둘리", LocalDate.of(1995, 2, 12), "gmil@gmail.com", Sex.MALE);
        Person p5 = new Person("또치", LocalDate.of(1988, 5, 31), "gdhong@gmail.com", Sex.FEMALE);

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        /*
         * CheckPerson 인터페이스 객체를 만드는 방법 3가지
         * 1. 클래스를 정의하고 그 크래스의 객체를 생성
         * 2. 무명클래스로 생성
         * 3.
         */

        printGender(persons, (p) -> p.getGender() == Sex.MALE);

    }

    /*
     * Java에서는 유용하게 사용할 수 있는 Functional Interface를 제공하고 있다.
     * Functional Interface는 오직 하나의 추상 메소드를 가지는 제네릭 인터페이스이다.
     * 즉 이 타입의 객체를 원하는 곳에는 람다식으로 전달할 수 있다.
     */

    public static void printGender(LIst<Person> list, CheckGender cg) {
        for (Person p : list) {
            if (cg.isMale(p)) {
                System.out.println(p.getName() + "은 남자입니다.");
            } else {
                System.out.println(p.getName() + "은 여자입니다.");
            }
        }
    }

    public boolean checkGender(Person a) {
        if (a.getGender() == Sex.MALE) {
            return true;
        } else {
            return false;
        }

    }
}

interface CheckGender {
    boolean isMale(Person p);
}