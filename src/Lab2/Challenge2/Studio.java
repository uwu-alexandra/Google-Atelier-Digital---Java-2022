package Lab2.Challenge2;

public class Studio {
    String nume;
    Film[] filme;

    public Studio (String numeS, Film[] filmeS) {
        this.filme = filmeS;
        this.nume = numeS;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

}
