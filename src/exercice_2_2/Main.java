package exercice_2_2;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Amin", "amin.helali@etu.univ-amu.fr", 'M');
        Author author2 = new Author("Sarah", "sarah@etu.univ-amu.fr", 'F');

        Author[] authors = {author1, author2};

        Book book = new Book("Livre de la Jungle", authors, 29.99, 10);

        System.out.println("Book: " + book.getName());
        System.out.println("Authors: " + book.getAuthorNames());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Quantity: " + book.getQty());
    }
}


