package Problem3;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {
        this.street = "Street Address";
        this.city = "City";
        this.state = "State";
        this.zip = "Zip Code";
    }

    public Address(Address newAddress) {
        this.street = newAddress.street;
        this.city = newAddress.city;
        this.state = newAddress.state;
        this.zip = newAddress.zip;
    }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString() {
        return String.format("""
                Address [
                Street: %s,
                City:   %s,
                State:  %s,
                Zip:    %s ]
                """, street, city, state, zip);
    }
}