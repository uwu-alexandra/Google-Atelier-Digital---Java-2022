package Lab2.Challenge2;

public class Film {
    Integer anAparitie;
    String nume;
    Actor[] actori;

    public Film (Integer anAparitieF, String numeF, Actor[] actoriF) {
        this.anAparitie = anAparitieF;
        this.nume = numeF;
        this.actori = actoriF;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }
}
