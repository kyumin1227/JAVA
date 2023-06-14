package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        Student std1 = new Student("고길동", 77);
        Student std2 = new Student("홍길동", 71);
        Student std3 = new Student("김길동", 87);
        Student std4 = new Student("이길동", 47);
        Student std5 = new Student("박길동", 15);
        Student std6 = new Student("기길동", 69);
        Student std7 = new Student("안길동", 47);
        Student std8 = new Student("석길동", 68);

        List<Student> list = new ArrayList<>();
        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);
        list.add(std5);
        list.add(std6);
        list.add(std7);
        list.add(std8);

        print(list);
        System.out.println("정렬 후");

        // class 이용
        // Collections.sort(list, new MyComparator());

        // 무명 함수 이용
        // Collections.sort(list, new Comparator<Student>() {
        // public int compare(Student s1, Student s2) {
        // return s1.grade - s2.grade;
        // }
        // });

        // 람다식 이용
        Collections.sort(list, (s1, s2) -> s1.grade - s2.grade);

        print(list);
    }

    public static void print(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + list.get(i).name + "," + list.get(i).grade + "]");
        }
        System.out.println();
    }
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.grade - o2.grade;
    }

}