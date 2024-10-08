//Brad Ayers
//October 5, 2024
//QAP2

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return zip;
    }

    public String toString() {
        return this.getStreet() + "\n"
        + this.getCity() + "\n"
        + this.getState() + "\n"
        + this.getZip();
    }
}
