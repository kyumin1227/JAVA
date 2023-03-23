package Chapter7;

public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Eagle eagle = new Eagle();
        
        lion.eat();
        lion.sleep();
        lion.roar();
        eagle.eat();
        eagle.sleep();
        eagle.fly();
    }
}
