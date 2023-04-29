package test0427.Chapter7;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1, a2, a3;

        a1 = new Animal();
        a2 = new Dog();
        a3 = new Cat();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
