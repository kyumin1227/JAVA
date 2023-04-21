package Chapter9.InterfaceTest;

import Chapter7.Polymorphism.Util;

public class Test {
    public static void main(String[] args) {
        // String s1 = "ABC";
        // String s2 = "ABD";
        // System.out.println(s1.compareTo(s2));
        // Student std1 = new Student("일지매", "컴정");
        // Student std2 = new Student("홍길동", "컴정");
        // findLarger(std1, std2);
        Car[] cars = new Car[5];
        Car car1 = new Car("HyunDai", "porter", 150, 20000000);
        cars[0] = car1;
        Car car2 = new Car("KIA", "Ray", 180, 20000000);
        cars[1] = car2;
        Car car3 = new Car("HyunDai", "sonata", 200, 35000000);
        cars[2] = car3;
        Car car4 = new Car("Benz", "E300", 250, 90000000);
        cars[3] = car4;
        Car car5 = new Car("AUDI", "A8", 280, 150000000);
        cars[4] = car5;

        Util.selectionSort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }

        // findLarger(car1, car2);
    }

    public static void findLarger(Comparable c1, Comparable c2) {
        if (c1.compareTo(c2) == 0) {
            System.out.println("같다.");
        } else if (c1.compareTo(c2) > 0) {
            System.out.println("첫번째가 크다.");
        } else {
            System.out.println("두번째가 크다.");
        }
    }
}
