package Lab3.Project.Visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public double visit(Drink drinkItem) {
        System.out.println("Drink item: Price with Tax");
        return Double.parseDouble(df.format((drinkItem.getPrice() * .32) + drinkItem.getPrice()));
    }

    @Override
    public double visit(Food foodItem) {
        System.out.println("Food item: Price with Tax");
        return Double.parseDouble(df.format((foodItem.getPrice() * .9) + foodItem.getPrice()));
    }

    @Override
    public double visit(Other otherItem) {
        System.out.println("Other item: Price with Tax");
        return Double.parseDouble(df.format((otherItem.getPrice() * .18) + otherItem.getPrice()));
    }
}
