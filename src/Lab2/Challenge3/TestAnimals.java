package Lab2.Challenge3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        //a. calling the methods in each class
        //fish d
        d.eat();
        d.walk();

        //cat c
        System.out.println("Name before using setName method: " + c.getName());
        c.play();
        c.setName("Luna");
        System.out.println("Name after using setName method: " + c.getName());
        c.getName();
        c.walk();

        //animal a - fish;
        a.eat();
        a.walk();

        //animal e - spider;
        e.eat();
        e.walk();

        //pet p - cat
        System.out.println("Name before using setName method: " + p.getName());
        p.play();
        p.setName("Kit");
        System.out.println("Name after using setName method: " + p.getName());
        p.getName();
    }
}
