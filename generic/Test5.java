package generic;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test5 {
    public static void main(String[] args) {
        Professor p1 = new Professor("홍길동", 40);
        Professor p2 = new Professor("김길동", 35);
        Professor p3 = new Professor("이길동", 47);
        Professor p4 = new Professor("박길동", 57);
        Professor p5 = new Professor("기길동", 61);

        List<Professor> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        print(list);
        System.out.println("정렬 후");

        // Collections.sort(list, new Comparator<Professor>() {
        // public int compare(Professor p1, Professor p2) {
        // return -(p1.age - p2.age);
        // }
        // });

        // Collections.sort(list, (pf1, pf2) -> -(pf1.age - pf2.age));

        Collections.sort(list, new MyComparator2());
        print(list);

    }

    public static void print(List<Professor> list) {
        for (Professor p : list) {
            System.out.println("[" + p.name + "," + p.age + "]");
        }
        System.out.println();
    }
}

class MyComparator2 implements Comparator<Professor> {

    @Override
    public int compare(Professor o1, Professor o2) {
        return -(o1.age - o2.age);
    }

}