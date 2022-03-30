package Lab2.Challenge1;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter1", 100, 10);
        Fighter fighter2 = new Fighter("Fighter2", 100, 30);

        BoxingMatch boxingMatch1 = new BoxingMatch(fighter1,fighter2);

        System.out.println("First round winner is: " + boxingMatch1.fight());


    }
}
