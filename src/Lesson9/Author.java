package Lesson9;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lostName;

    public Author(String firstName, String lostName) {
        this.firstName = firstName;
        this.lostName = lostName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLostName() {
        return lostName;
    }

    @Override
    public String toString() {
        return "{" + "Имя " + firstName + '\'' + ", Фамилия " + lostName + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lostName, author.lostName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lostName);
    }
}
