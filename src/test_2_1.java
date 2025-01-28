public class Main {
    public static void main(String[] args) {
        Author Amin = new Author(" Amin", "amin.helali@etu.univ-amu.fr", 'm');
        System.out.println(Amin);

        Amin.setEmail("amin.helali@etu.univ-amu.fr");
        System.out.println("name is: " + Amin.getName());
        System.out.println("email is: " + Amin.getEmail());
        System.out.println("gender is: " + Amin.getGender());

        Book livreDeLaJungle = new Book("Livre de la Jungle", Amin, 20.99, 65);
        System.out.println(livreDeLaJungle);

        livreDeLaJungle.setPrice(20.99);
        livreDeLaJungle.setQty(65);
        System.out.println("Le nom du livre est : " + livreDeLaJungle.getName());
        System.out.println("Le prix est de : " + livreDeLaJungle.getPrice());
        System.out.println("La quantitÃ© est de : " + livreDeLaJungle.getQty());
        System.out.println("L'auteur est : " + livreDeLaJungle.getAuthor());
        System.out.println("L'auteur est son nom sont : " + livreDeLaJungle.getAuthor().getName());
        System.out.println("L'email de l'auteur est : " + livreDeLaJungle.getAuthor().getEmail());

    }
}