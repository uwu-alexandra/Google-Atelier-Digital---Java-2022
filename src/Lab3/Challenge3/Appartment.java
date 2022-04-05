package Lab3.Challenge3;

public class Appartment {
    private String location;
    private int monthlyRentCost;

    Appartment(String locationNew, int monthlyRentCostNew) {
        this.location = locationNew;
        this.monthlyRentCost = monthlyRentCostNew;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public void setMonthlyRentCost(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
