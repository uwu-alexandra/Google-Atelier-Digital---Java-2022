package Lab3.Project.ChainOfResponsability;

public class Numbers {
    private int number1;
    private int number2;

    private String calculationWanted;
    public Numbers(int newNumber1, int newNumber2, String newCalculationWanted) {
        this.number1 = newNumber1;
        this.number2 = newNumber2;
        this.calculationWanted = newCalculationWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
