package Lab3.Challenge6;

public class Main {

    public static void main(String[] args) {
    Person.Builder personB1 = new Person.Builder("Persoana cu toate atributele")
            .job("Software Developer")
            .drivingLicense(true)
            .university("UPT")
            .isMarried(false);

    Person.Builder personB2 = new Person.Builder("Persoana doar cu atribut madatory");

    Person person = personB1.build();
    Person person1 = personB2.build();

    System.out.println(person.getName() + " " + person.getJob() + " " + person.getUniveristy() + " driv license: " + person.isDrivingLicense() + " is " +
                "married: " + person.isMarried());
    System.out.println(person1.getName() + " " + person1.getJob() + " " + person1.getUniveristy() + " driv license: " + person1.isDrivingLicense() + " is " +
                "married: " + person1.isMarried());
    }
}
