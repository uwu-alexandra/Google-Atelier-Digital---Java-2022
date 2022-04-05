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

    public Film getMovieByActor(String numeActor) {
        for (Film movie : filme) {
            if(movie.getActorsByName(numeActor) != null)
                return movie;
        }
        return null;
    }

    public void getMovieByActorAge(int varstaActor) {
        for (Film movie : filme) {
            if (movie.getActorByAge(varstaActor) != null)
                System.out.println(movie.getNume());
        }
    }
}
