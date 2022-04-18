package Lab5.Challenge1;

public abstract class Currency {
    private float value;
    private float rate;

    Currency(Float value, Float rate) {
        this.value = value;
        this.rate = rate;
    }



    public Currency(Float value) {
        this.value = value;

    }

    public float getValue() {
        return value;
    }

    public float getRate() {
        return rate;
    }
}
