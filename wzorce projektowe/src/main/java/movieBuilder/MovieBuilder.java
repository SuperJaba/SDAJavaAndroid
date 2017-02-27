package movieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class MovieBuilder {
    private Movie movie;

    public MovieBuilder() {
        movie = new Movie();
    }

    public MovieBuilder withRezyser(String rezyser) {
        movie.setRezyser(rezyser);
        return this;
    }

    public MovieBuilder withScenariusz(String scenariusz) {
        movie.setScenariusz(scenariusz);
        return this;
    }

    public MovieBuilder withGatunek(String gatunek) {
        movie.setGatunek(gatunek);
        return this;
    }

    public MovieBuilder withProdukcja(String produkcja) {
        movie.setProdukcja(produkcja);
        return this;
    }

    public MovieBuilder withPremiera(String premiera) {
        movie.setPremiera(premiera);
        return this;
    }

    public MovieBuilder withTytul(String tytul) {
        movie.setTytlu(tytul);
        return this;
    }

    public Movie build() {
        return movie;
    }
}
