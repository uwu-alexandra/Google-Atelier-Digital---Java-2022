package Lab3.Project.Visitor;

public interface Visitor {
    double visit(Drink drinkItem);
    double visit(Food foodItem);
    double visit(Other otherItem);

}
