package Chapter7;

public class SportCar extends Car {
    boolean turbo;

    public void setTurbo(boolean flag) {
        turbo = flag;

        
    }

    @Override
    public String toString() {
        return "speed["+speed+"], turbo["+turbo+"]";
    }
}
