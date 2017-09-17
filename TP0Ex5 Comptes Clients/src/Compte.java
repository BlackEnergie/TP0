public class Compte {
	private static int DernierNumCompte = 0;
	
	private int numero;
	private double solde;
	private Client client;
	
	public Compte() {
		DernierNumCompte += 1;
		this.numero = DernierNumCompte;
		this.solde = 0;
	}
	
	public Client getClient() {
		return this.client;
	}
	
	public boolean setClient(Client unClient) {
		boolean ok = false;
		if(client == null) {
			this.client = unClient;
			ok = true;
		}
		return ok; 
	}
	
	public void crediter(double montant) {
		this.solde += montant;
	}
	
	public void debiter(double montant) {
		this.solde -= montant; 
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public int getNumeroCompte() {
		return this.numero;
	}
	
	public void afficher() {
		System.out.println("Numero de Compte : " + this.numero);
		System.out.print("Solde : " + this.solde +"€ \n \n");
	}
}
