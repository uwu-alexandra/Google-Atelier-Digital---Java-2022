package Lab3.Challenge3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy implements RealEstateAgent{

    private List<Appartment> mylist = new ArrayList<>();

    @Override
    public void represent(Appartment appartment) {
        mylist.add(appartment);
    }

    @Override
    public Appartment rent(Student student) {
        if (student.getName().startsWith("P")) {
            return null;
        }
        for(Appartment appartment : mylist) {
            if(student.getMoney() > appartment.getMonthlyRentCost()) {
                return appartment;
            }

        }
        return null;
    }
}
