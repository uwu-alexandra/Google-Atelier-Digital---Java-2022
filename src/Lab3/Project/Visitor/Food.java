package Lab3.Project.Visitor;

public class Food implements Visitable{

    private double price;

    Food(double item) {
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