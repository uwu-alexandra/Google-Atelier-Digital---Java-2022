package Lab5.Challenge1;

public class USD extends Currency {

    public USD(Float value, Float rate) {
        super(value, rate);
    }

    public USD(Float value) {
        super(value);
    }

    @Override
    public String toString() {
        return "USD: " + getValue();
    }
}
