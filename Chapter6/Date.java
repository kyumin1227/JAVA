package Chapter6;
public class Date {
    private int year, day;
    private String month;
    
    public Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(int year) {
        this(year, "1월", 1);
    }

    public Date() {
        // this(1900, "1월", 1);
        this(1900);
    }

    public String toString() {
        return "Date [year="+year+", month="+month+", day="+day+"]";
    }

    public static void main(String[] args) {
        Date d1 = new Date(2015, "8월", 10);
        System.out.println( d1.toString());
        Date d2 = new Date(2020);
        System.out.println(d2.toString());
        Date d3 = new Date();
        System.out.println(d3.toString());
    }
}
