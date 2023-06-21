package test0621.chapter9;

public class Rectangle implements Comparable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    public int getArea() {
        return width * height;
    }

    public Object findLargest(Object object1, Object object2) {
        Comparable obj1 = (Comparable) object1;
        Comparable obj2 = (Comparable) object2;

        if (obj1.compareTo(obj2) > 0) {
            return obj1;
        } else {
            return obj2;
        }
    }

    public Object findSmallest(Object object1, Object object2) {
        Comparable obj1 = (Comparable) object1;
        Comparable obj2 = (Comparable) object2;

        if (obj1.compareTo(obj2) > 0)
            return obj2;
        else
            return obj1;
    }

    public boolean isEqual(Object object1, Object object2) {
        Comparable obj1 = (Comparable) object1;
        Comparable obj2 = (Comparable) object2;

        if (obj1.compareTo(obj2) == 0)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Object other) {
        Rectangle otherRect = (Rectangle) other;
        if (this.getArea() > otherRect.getArea())
            return 1;
        else if (this.getArea() < otherRect.getArea())
            return -1;
        else
            return 0;
    }

}
