import java.text.DecimalFormat;

public class Account {
    private int regNumber;
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        DecimalFormat decFormat = new DecimalFormat("###,###");     // 3자리 마다 , 표시
        return decFormat.format(balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
