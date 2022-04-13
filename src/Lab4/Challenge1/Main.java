package Lab4.Challenge1;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb1 = new PhoneBook("src/Lab4/Challenge1/Input.txt");

        System.out.println("Phone number for contact Abbey is: " + pb1.getContactByName("Abbey").getPhoneNumber());
        System.out.println("Phone number for contact Abdul is: " + pb1.getContactByName("Abdul").getPhoneNumber());
    }
}
