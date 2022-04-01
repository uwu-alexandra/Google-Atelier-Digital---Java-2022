package Lab2.Challenge3;

public class Cat extends Animal implements Pet {
    String name;

    Cat(String nameC) {
        super(4);
        this.name = nameC;
    }

    Cat() {
        this("");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String setName(String nameS) {
        return this.name = nameS;
    }

    @Override
    public void play() {
        System.out.println("Cats play with boxes <3 ");
    }

    @Override
    void eat() {
        System.out.println("Cats like to drink milk from time to time :)");
    }
}
