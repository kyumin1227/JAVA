package Chapter7;

public abstract class ShapeAbstract {
    private int x;
    private int y;

    // ShapeAbstract를 상속받는 자식 클래스는 move 메소드를 그대로 사용하면 된다.
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("도형을 ["+x+", "+y+"]로 옮겼습니다.");
    }
    
    // ShapeAbstract를 상속받는 자식 클래스는 화면에 그리는 기능을 가져야 하지만
    // 그려지는 모양은 다 다르다. 따라서, ShapeAbstract 클래스는 그리는 기능을 수행하는 메소드의
    // 시그니처만 정의하고 메소드 몸체의 구현은 자식 클래스가 하도록 강제하자.

    public abstract void draw();
}
