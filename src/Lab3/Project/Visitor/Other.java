package Lab3.Project.Visitor;

public class Other implements Visitable{

    private double price;

    Other(double item) {
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