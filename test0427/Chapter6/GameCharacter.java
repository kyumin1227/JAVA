package test0427.Chapter6;

import java.util.ArrayList;

public class GameCharacter {

    public class GameItem {
        private String name;
        private int type;
        private int price;

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "GameItem [name=" + name + ", type=" + type + ", price=" + price + "]";
        }
    }

    private ArrayList<GameItem> items = new ArrayList<>();

    public void add(String name, int type, int price) {
        GameItem item = new GameItem();
        item.name = name;
        item.price = price;
        item.type = type;
        items.add(item);
    }

    public void print() {
        int total = 0;
        for (GameItem i : items) {
            System.out.println(i);
            total += i.getPrice();
        }
        System.out.println(total);
    }

}
