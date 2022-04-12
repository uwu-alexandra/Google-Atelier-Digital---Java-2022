package Lab3.Project.Visitor;

public class Main {
    public static void main(String[] args) {
        TaxVisitor taxCalc = new TaxVisitor();

        Food bread = new Food(3.25);
        Drink coke = new Drink(2.5);
        Other laptop = new Other(2503.37);

        System.out.println(bread.acceept(taxCalc) + "\n");
        System.out.println(coke.acceept(taxCalc) + "\n");
        System.out.println(laptop.acceept(taxCalc) + "\n");
    }
}
