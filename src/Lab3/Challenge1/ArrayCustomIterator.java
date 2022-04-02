package Lab3.Challenge1;
import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class ArrayCustomIterator {

    private int[] array;
    private int position = 0;

    ArrayCustomIterator(int[] newArray) {
        this.array = newArray;
    }

    public boolean hasNext() {
        return position < array.length;
    }

    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[position++];
    }
}
