package movieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */

//POJO
public class Movie {
    private String tytlu;

    public String getTytlu() {
        return tytlu;
    }

    public void setTytlu(String tytlu) {
        this.tytlu = tytlu;
    }

    private String rezyser;
    private String scenariusz;
    private String gatunek;
    private String produkcja;
    private String premiera;

    public String getRezyser() {
        return rezyser;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public String getScenariusz() {
        return scenariusz;
    }

    public void setScenariusz(String scenariusz) {
        this.scenariusz = scenariusz;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getProdukcja() {
        return produkcja;
    }

    public void setProdukcja(String produkcja) {
        this.produkcja = produkcja;
    }

    public String getPremiera() {
        return premiera;
    }

    public void setPremiera(String premiera) {
        this.premiera = premiera;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tytlu='" + tytlu + '\'' +
                ", rezyser='" + rezyser + '\'' +
                ", scenariusz='" + scenariusz + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", produkcja='" + produkcja + '\'' +
                ", premiera='" + premiera + '\'' +
                '}';
    }
}
