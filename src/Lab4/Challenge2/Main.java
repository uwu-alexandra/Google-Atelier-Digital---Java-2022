package Lab4.Challenge2;

public class Main {
    public static void main(String[] args) {
        SecretMessage sm = new SecretMessage("src/Lab4/Challenge2/Input.txt");
        System.out.println(sm.getMessage());
    }
}
