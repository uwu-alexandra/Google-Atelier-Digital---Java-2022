package Lab3.Project.Visitor;

public class Drink implements Visitable{

    private double price;

    Drink(double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public double acceept(Visitor visitor) {
        return visitor.visit(this);
    }
}
