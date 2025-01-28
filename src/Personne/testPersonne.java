package Personne;

public class testPersonne {
	
	public static void main (String [] args) {
		Personne p1 = new Personne("HELALI","Amin");
		Personne p2 = new Personne();
		System.out.println(p1.getnom());
		System.out.println(p1.getPrenom());
		System.out.println(p1.toString());
		System.out.println(p2.getnom());
		System.out.println(p2.getPrenom());
		System.out.println(p2.toString());
	}
}