
public class TestVoiture {

	public static void main(String[] args) {
//		Voiture v1 = new Voiture();
//		v1.init("coccinelle", "VW", "bleu", 123000);
//		v1.afficher();
//		v1.demarrer();
//		int distance = v1.rouler(40);
//		System.out.println(distance);
//		v1.afficher();
		VoitureJamesBond JB = new VoitureJamesBond();
		JB.afficher();
		JB.setKilometrage(132589);
		JB.rouler(30);
		JB.afficher();
		
	}

}
