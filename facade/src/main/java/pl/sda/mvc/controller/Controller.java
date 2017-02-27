package pl.sda.mvc.controller;

import impl.FibonacciIterational;
import pl.sda.fibonacci.Fibonacci;
import pl.sda.mvc.model.Model;
import pl.sda.mvc.model.ModelFacade;

import java.util.List;

public class Controller {

    public long getFibValue(int n) {
        Fibonacci fibonacci = new FibonacciIterational() ;
        long val = fibonacci.getNWalue(n);
        ModelFacade.addNewValueThroughFacade(val);
        return val;
        }

    public double average() {
        double sum = 0;
        List<Long> values = ModelFacade.getValuesTroughFacade();

        for (long val : values) {
            sum = sum + val;
        }
        return sum / values.size();
    }
}
