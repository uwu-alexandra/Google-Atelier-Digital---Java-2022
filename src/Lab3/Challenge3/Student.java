package Lab3.Challenge3;

public class Student {
    private String name;
    private int money;

    Student(String nameNew, int moneyNew) {
            this.money = moneyNew;
            this.name = nameNew;
        }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }
}
