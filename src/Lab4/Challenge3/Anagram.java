package Lab4.Challenge3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    private String word;


    public Anagram(String inputFile, String outputFile) {

        String answer = "";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
                while ((line = br.readLine()) != null) {
                    String[] arr = line.split(" ");
                    for (String word : arr) {
                        permute(word, answer, out);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void permute(String word, String answer, BufferedWriter out) throws IOException {
        if (word.length() == 0) {
            out.write(answer + "\n");
        }
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            String left_substr = word.substring(0, i);
            String right_substr = word.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch, out);
        }
    }
}
