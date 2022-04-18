package Lab5.Challenge1;

public class RON extends Currency {

    public RON(Float value, Float rate) {
        super(value, rate);
    }

    public RON(Float value) {
        super(value);
    }

    @Override
    public String toString() {
        return "RON: " + getValue();
    }
}
