public class Client {
	private static int dernierNumClient = 0;
	private final static int COMPTES = 10;
	
	private long numero;
	private String nom;
	private Compte[] lesComptes;
	private int nbComptes = 0;
	
	public Client(String nom) {
		this.numero = dernierNumClient + 1;
		this.nom = nom;
		lesComptes = new Compte[COMPTES];
	}
	
	public double total() {
		double total = 0;
		for(int i=0 ; i < nbComptes; i++) {
			total += lesComptes[i].getSolde();
		}
		return total;
	}
	
	public long getNumeroClient() {
		return this.numero;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void afficher() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Numero Client : " + this.numero +"\n");
		for(int i=0; i< nbComptes; i++) {
			lesComptes[i].afficher();
		}
	}
	
	//Ajoute un compte au client s'il n'est pas déjà affecté à un client
	public void affecterCompte(Compte unCompte) {
		boolean ok = true;
		for(int i=0; i < nbComptes; i++) {
			if (lesComptes[i].getNumeroCompte() == unCompte.getNumeroCompte())
				ok = false;
		}
		if(ok == true) {
			if(unCompte.setClient(this)) {
				lesComptes[nbComptes] = unCompte;
				nbComptes += 1 ;
			}
		}
	}
	
	public int nbComptes() {
		return nbComptes;
	}
	 
}
