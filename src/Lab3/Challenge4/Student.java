package Lab3.Challenge4;

public class Student implements Observer{

    private String name;
    private String message;

    Student(String nameNew) {
        this.name = nameNew;
    }

    @Override
    public void update(String newMessage) {
        System.out.println("Student " + this.name + " learned about " + newMessage);
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    public String getName() {
        return this.name;
    }
}
