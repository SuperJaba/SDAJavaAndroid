package movieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class MovieMain {
    public static void main(String[] args) {
        MovieBuilder movieBuilder = new MovieBuilder();

        Movie movie = movieBuilder.withTytul("Nietykalni").withRezyser("Olivier Nakache, Eric Toledano")
                .withGatunek("komedia")
                .withProdukcja("Francja")
                .withScenariusz("Olivier Nakache, Eric Toledano")
                .withPremiera("13 kwietnia 2012 (Polska) 23 września 2011 (świat)")
                .build();

        System.out.println(movie);
    }
}
