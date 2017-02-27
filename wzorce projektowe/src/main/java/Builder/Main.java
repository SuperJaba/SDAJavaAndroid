package Builder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonAdres adres = new PersonAdres();
        adres.setCity("Poznan");
        adres.setStreet("Baraniaka 88");
        adres.setPostalCode("61-220");


        Person person = personBuilder.withFirstName("Jaś").withLastName("Kowalski").withPesel("987654321")
                .withPersonAddress(adres)
                .build();
        System.out.println(person);
    }


}
