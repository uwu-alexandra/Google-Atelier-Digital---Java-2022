package Lab4.Challenge5;

import Lab4.Challenge5.Count;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Count c = new Count("src/Lab4/Challenge5/Input.txt", "src/Lab4/Challenge5/Output.txt");
    }
}
