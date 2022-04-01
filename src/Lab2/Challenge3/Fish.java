package Lab2.Challenge3;

public class Fish extends Animal {

    Fish()
    {
        super(0);
    }
    @Override
    void eat() {
        System.out.println("Fishes eat fishy food xD ");
    }

    @Override
    void walk()
    {
        System.out.println("Fishes can't walk because they have no legs :( ");
    }
}
