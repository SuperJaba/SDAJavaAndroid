package Builder;

/**
 * Created by RENT on 2017-02-25.
 */
public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        person= new Person();
    }

    public PersonBuilder withFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }
    public PersonBuilder withLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }
    public PersonBuilder withPersonAddress(PersonAdres personAdress) {
        person.setAddres(personAdress);
        return this;
    }
    public PersonBuilder withPesel(String pesel) {
        person.setPesel(pesel);
        return this;
    }

    public Person build() {
        return person;
    }

}
