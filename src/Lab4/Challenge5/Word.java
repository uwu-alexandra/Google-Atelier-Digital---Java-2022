package Lab4.Challenge5;

public class Word implements Comparable<Word>{
    String word;
    int count;

    Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(Word o) {
        return Integer.compare(o.count, this.count);
    }
}
