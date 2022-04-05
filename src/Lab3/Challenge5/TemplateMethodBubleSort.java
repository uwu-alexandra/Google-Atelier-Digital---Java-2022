package Lab3.Challenge5;

public abstract class TemplateMethodBubleSort {
    void sort(Integer[] list) {
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (!numbersInCorrectOrder(list[j], list[j + 1])) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
