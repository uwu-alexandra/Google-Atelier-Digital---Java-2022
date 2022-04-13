package Lab4.Challenge1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    Contact[] contacts = new Contact[5000];
    private int count = 0;

    public PhoneBook(String inputFile) {

        String name;
        String phoneNumber;
        try (Scanner s = new Scanner(new BufferedReader(new FileReader(inputFile)))) {
            while (s.hasNext()) {
                name = s.next();
                phoneNumber = s.next();
                contacts[count++] = new Contact(name, phoneNumber);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Contact getContactByName(String searchedName) {
        for (int i = 0; i <= count ; i++) {
            if (contacts[i].getName().equals(searchedName))
                return contacts[i];
        }
        return null;
    }
}
