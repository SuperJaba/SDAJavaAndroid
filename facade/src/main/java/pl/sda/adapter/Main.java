package pl.sda.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarImpl();
        Person person = new PersonImpl();

        CarToPersonAdapter carToPersonAdapter = new CarToPersonAdapter(car);

        List<Person> personList = new ArrayList<>();

        personList.add(person);
        personList.add(carToPersonAdapter);

        for (Person personFromList : personList) {
            personFromList.move();
            personFromList.say();
        }


        //implementacja adaptera w druga strone
        PersonToCarAdapter personToCarAdapter = new PersonToCarAdapter(person);

        List<Car> carList = new ArrayList<>();

        carList.add(car);
        carList.add(personToCarAdapter);

        for (Car carFromList : carList) {
            carFromList.horn();
            carFromList.drive();
        }

    }








    //odpowiednik metod powyzszych w rozwinieciu na pojedyncze metody
    public static void main2(String[] args) {
        Car car1 = new CarImpl();
        Car car2 = new CarImpl();

        Person person1 = new PersonImpl();
        Person person2 = new PersonImpl();

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        for (Person person : personList) {
            person.move();
            person.say();
        }

        for (Car car : carList) {
            car.drive();
            car.horn();
        }

    }
}
