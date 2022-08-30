package Lesson9;

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
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lostName='" + lostName + '\'' +
                '}';
    }

}
