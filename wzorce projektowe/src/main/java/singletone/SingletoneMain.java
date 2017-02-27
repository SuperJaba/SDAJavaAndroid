package singletone;

/**
 * Created by RENT on 2017-02-25.
 */
public class SingletoneMain {
    public static void main(String[] args) {
        Singletone singletone = Singletone.getInstance();

        System.out.println(singletone.getCounter() + " " + singletone.getName());

        Singletone singletone2 = Singletone.getInstance();
        System.out.println(singletone2.getCounter()+ " " + singletone2.getName());
    }
}
