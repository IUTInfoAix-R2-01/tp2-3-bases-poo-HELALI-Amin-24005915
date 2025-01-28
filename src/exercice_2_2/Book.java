package exercice_2_2;

public class Book {
    private String name;
    private double price;
    private Author[] authors;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + ", price=" + price + ", quantity=" + qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder auteurs = new StringBuilder();
        for (Author auteur : authors) {
            if (auteurs.length() > 0) {
                auteurs.append(", ");
            }
            auteurs.append(auteur.getName());
        }
        return auteurs.toString();
    }
}