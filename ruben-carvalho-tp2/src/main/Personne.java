package main;

import java.util.Objects;

public class Personne {
    private String lastName;
    private String firstName;

    public Personne(String lastName, String firstName) {
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
        Personne personne = (Personne) o;
        return Objects.equals(lastName, personne.lastName) &&
                Objects.equals(firstName, personne.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    @Override
    public String
    toString() {
        return "Creator{" + lastName + " " + firstName + '}';
    }
}
