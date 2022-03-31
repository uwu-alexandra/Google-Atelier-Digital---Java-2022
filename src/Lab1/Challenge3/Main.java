package Lab1.Challenge3;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 9, -5, 7, -5};
        Arrays.sort(array);
        int pairs = 0;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {

            if (array[i] + array[j] == 0) {
                pairs++;
            } else if (array[i] + array[j] > 0) {
                    j--;
                }
        }
        System.out.println(pairs);
    }


}

