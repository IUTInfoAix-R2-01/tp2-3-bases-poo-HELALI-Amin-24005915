package Personne;

public class Personne {
	String nom;
	String Prenom;

	
	public Personne(String nom, String Prenom) {
		this.nom = nom;
		this.Prenom = Prenom;
	}
	
	public Personne() {
		nom = "INCONNU";
		Prenom = "INCONNU";
	}
	
	public String getnom() {
		return nom;
		
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	public String toString() {
		return " Le nom : " + nom + " Prenom : " + Prenom;
		
	}

}
