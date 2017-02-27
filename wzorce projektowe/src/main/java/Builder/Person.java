package Builder;

/**
 * Created by RENT on 2017-02-25.
 */

//POJO Plain Old Java Object
public class Person {
    private String firstName;
    private String lastName;
    private PersonAdres addres;
    private String pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonAdres getAddres() {
        return addres;
    }

    public void setAddres(PersonAdres addres) {
        this.addres = addres;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addres=" + addres +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
