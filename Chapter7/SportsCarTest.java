package Chapter7;

public class SportsCarTest {
    public static void main(String[] args) {
        SportCar sc = new SportCar();
        sc.speed = 10;
        sc.setSpeed(60);
        sc.setTurbo(true);

        System.out.println(sc);
    }
}
