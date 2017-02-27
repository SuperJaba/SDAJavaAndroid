package singletone;

/**
 * Created by RENT on 2017-02-25.
 */
public class Singletone {
    private static Singletone instance = new Singletone();
    private static int counter = 0;

    private Singletone() {
        counter++;
    }

    public static Singletone getInstance() {
        Singletone result = instance;
        if (instance != null) {
            result = instance;
        } else{
            return new Singletone();
        }
        return result;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return "Singletone";
    }
}
