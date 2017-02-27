package pl.sda.mvc.model;

import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class ModelFacade {
    public static List<Long> getValuesTroughFacade() {
        return Model.getValues();
    }

    public static void addNewValueThroughFacade(long newValue) {
        Model.addValue(newValue);
    }
}
