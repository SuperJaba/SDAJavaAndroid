package mvc.controler;

import mvc.model.Model;

import java.util.List;
import java.util.Random;

/**
 * controller to plik gdzie sa metody do wykonania po pobraniu danych od urzytkownika (lub z innego zrodla pobiera dane i przeprowadza na nich operacje)
 */
public class Controller { //w przykladzie tworzymy randoma
    public int getFibValue(int n) {
        Random random = new Random();
        int val = random.nextInt(20000);
        Model.addValue(val);
        return val;
    }

    public double average() {
        double sum = 0;
        //TODO: pobierz tablice z modelu
        List<Integer> values = Model.getValues();
        for (int val : values) {
            sum = sum + val;
        }
        return sum / values.size();
    }

}
