//Bradley Ayers
//October 6, 2024
//QAP2

public class Person {
    private String lastName;
    private String firstName;
    private Address address;

    public Person(String lastName, String firstName, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String toString() {
        return lastName + ", " + firstName + "\n" + this.address.toString();
    }
}
