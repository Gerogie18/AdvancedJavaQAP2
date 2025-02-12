package Problem3;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person () {
        this.firstName = "First Name";
        this.lastName = "Last Name";
        this.home = new Address();
    }

    public Person (String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = new Address(home);
    }

    public String toString () {
        return String.format("""
                Person [
                First Name: %s,
                Last Name:  %s,
                Home: %s
                """, firstName, lastName, home.toString());
    }

}

