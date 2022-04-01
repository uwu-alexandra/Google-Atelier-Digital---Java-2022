package Lab1.Challenge4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, -1, -1, 0, 2};
        Arrays.sort(array);
        int tempS;
        int pairs = 0;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
           if (array[i] + array[j] > 0) {
               tempS = array[i] + array[j];
               for (int k = i; k < j ; k++) {
                   {
                       if (tempS + array[k] == 0)
                       {
                           pairs++;
                           break;
                       }
                   }
               }
            }
           else if (array[i] + array[j] < 0) {
               tempS = array[i] + array[j];
               for (int k = j - 1; k > i ; k--) {
                   {
                       if (tempS + array[k] == 0)
                       {
                           pairs++;
                           break;
                       }
                   }
               }
           }
        }
        System.out.println(pairs);
    }


}

