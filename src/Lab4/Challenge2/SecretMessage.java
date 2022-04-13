package Lab4.Challenge2;

import Lab4.Challenge1.Contact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class SecretMessage {
    private StringBuilder message;

    public StringBuilder getMessage() {
        return message;
    }

    public SecretMessage(String inputFile) {
        message = new StringBuilder();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            while ((line = br.readLine()) != null) {
                for(char c: line.toCharArray()) {
                    if (isUpperCase(c)) {
                        if (c == 'X') {
                            message.append(" ");
                        } else {
                        message.append(c);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
