package Lab3.Project.ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubNumbers();
        Chain chainCalc3= new MultNumbers();
        Chain chainCalc4 = new DivNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request1 = new Numbers(5, 7, "add");
        Numbers request2 = new Numbers(2, 3, "multiply");

        chainCalc1.calculate(request1);
        chainCalc3.calculate(request2);

    }
}
