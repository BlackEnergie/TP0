
public class Voiture {
	
	private String nom ;
	private String marque;
	private String couleur;
	protected int kilometrage;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	
	public void init(String pnom, String pmarque, String pcouleur, int pkilometrage ) {
		this.nom = pnom;
		this.marque = pmarque;
		this.couleur = pcouleur;
		this.kilometrage = pkilometrage;
	}
	
	public void demarrer() {
		System.out.println("Démarrage");
	}
	
	public int rouler(int pduree) {
		int distance;
		distance = pduree * 60;
		this.kilometrage += distance;
		return distance;
	}
	
	public void afficher() {
		System.out.println("nom: " + this.nom);
		System.out.println("marque: " + this.marque);
		System.out.println("couleur: " + this.couleur);
		System.out.println("kilometrage: " + this.kilometrage);
	
	}

}

