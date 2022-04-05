package Lab3.Challenge3;

public class Main {
    public static void main(String[] args) {
        Appartment app01 = new Appartment("Crangasi01", 300);
        Appartment app02 = new Appartment("Crangasi02", 300);
        Appartment app03 = new Appartment("Crangasi03", 300);
        Appartment app04 = new Appartment("Crangasi04", 300);
        Appartment app05 = new Appartment("Crangasi05", 300);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Appartment appartmentForStudent01 = proxy.rent(student01);
        Appartment appartmentForStudent02 = proxy.rent(student02);

        System.out.println(student01.getName() + " rented appartment in " + appartmentForStudent01.getLocation());
        System.out.println(student02.getName() + " rented " + appartmentForStudent02);
    }
}
