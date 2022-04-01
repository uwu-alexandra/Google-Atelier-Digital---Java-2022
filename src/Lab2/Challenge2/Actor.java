package Lab2.Challenge2;

public class Actor {

    String nume;
    Integer varsta;
    Premiu[] premii;

    public Actor(String numeA, Integer varstaA, Premiu[] premiiA) {
        this.nume = numeA;
        this.varsta = varstaA;
        this.premii = premiiA;
    }

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

}
