package Lesson9;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Petr", "Popov");
        Author author1 = new Author("Petr1", "Popov1");
        var book1 = new Book("Book1", author, 1548);
        var book2 = new Book("Book2", author1, 1988);

        book2.setYearOfPublication(2010);

        System.out.println(book1.getName() + " " + book1.getAuthor() + " " + book1.getYearOfPublication());

        // Task 10
        // Реализовать методы toString, equals и hashCode в классах Author и Book,
        // которые были созданы на прошлом уроке. Обратите внимание,
        // что toString книги не должен дублировать код из toString автора,
        // а должен делегировать (вызывать) его версию метода.

        System.out.println(book2);

        System.out.println(author.equals(author1));

        System.out.println(book2.hashCode() == book1.hashCode());



    }

}
