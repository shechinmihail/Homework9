package Lesson9;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private Integer yearOfPublication;


    public Book(String name, Author author, Integer yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Имя книги " + name + '\'' +
                ", Автор " + author +
                ", Год публикации " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(yearOfPublication, book.yearOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublication);
    }
}
