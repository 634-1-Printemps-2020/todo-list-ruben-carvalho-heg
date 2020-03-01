package main;

import java.util.Objects;

public class Creator {
    private String lastName;
    private String firstName;

    public Creator(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        Creator creator = (Creator) o;
        return Objects.equals(lastName, creator.lastName) &&
                Objects.equals(firstName, creator.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    @Override
    public String
    toString() {
        return "Creator{" + lastName + " " + firstName +
                '}';
    }
}
