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

    public Actor getActorsByName(String numeActor) {
        for (Actor act: actori) {
            if (act.getNume().equals(numeActor)) {
                return act;
            }
        }
        return null;
    }

    public Actor getActorByAge(int varstaActor) {
        for (Actor act: actori) {
            if(act.getVarsta() >= varstaActor) {
                return act;
            }

        }
        return null;
    }
}
