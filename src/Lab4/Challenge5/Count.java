package Lab4.Challenge5;

import java.io.*;
import java.util.*;

public class Count {

    private String word;

    public Count(String inputFile, String outputFile) {
        String line;
        ArrayList<String> wordsArray = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
                while ((line = br.readLine()) != null) {
                    String[] arr = line.split(" ");
                    Collections.addAll(wordsArray, arr);
                }
                ArrayList<Word> finalList = new ArrayList<>();
                TreeSet<String> distinct = new TreeSet<>(wordsArray);
                for(String w : distinct) {
                    Word word = new Word(w,Collections.frequency(wordsArray, w));
                    finalList.add(word);
                }
                finalList.sort(Word::compareTo);
                for(Word w : finalList) {
                    out.write(w.getWord() + ": " + w.getCount()  + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
