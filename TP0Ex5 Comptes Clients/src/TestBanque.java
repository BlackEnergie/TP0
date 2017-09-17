
public class TestBanque {
	public static void main(String[] args) {
		Client Michel = new Client("Michel");
		Client Jules = new Client("Jules");
		
		Compte BNP = new Compte();
		Compte LCL = new Compte();
		Compte CMSO = new Compte();
		
		Michel.affecterCompte(LCL);
		Michel.affecterCompte(BNP);
		Jules.affecterCompte(CMSO);
		BNP.crediter(2000);
		LCL.crediter(5230);
		BNP.debiter(3000);
		Michel.afficher();
		Jules.afficher();
		
	}
}
