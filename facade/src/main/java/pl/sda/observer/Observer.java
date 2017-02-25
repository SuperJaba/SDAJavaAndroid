package pl.sda.observer;


public class Observer {
    public void react(int value) {
        System.out.println("Wartość " + value +" została zmieniona na " + Math.abs(value));
    }
}
