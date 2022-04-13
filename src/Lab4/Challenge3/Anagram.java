package Lab4.Challenge3;

import java.io.*;
import java.util.Arrays;

public class Anagram {

    private String word;

    public Anagram(String inputFile, String outputFile, String wordAnagram) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
                while ((line = br.readLine()) != null) {
                    String[] arr = line.split(" ");
                    for (String word : arr) {
                       if (isAnagram(word, wordAnagram)) {
                           out.write(word + "\n");
                       }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            return Arrays.equals(ArrayS1, ArrayS2);
        }
    }
}
