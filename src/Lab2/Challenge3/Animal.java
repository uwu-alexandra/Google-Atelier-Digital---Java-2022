package Lab2.Challenge3;

abstract class Animal {
    protected int legs;

    protected Animal (int legsA) {
        this.legs = legsA;
    }

    abstract void eat();

    void walk() {
        System.out.println("The animal walks with " + this.legs + " legs");
    }

}
