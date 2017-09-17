
public class TestSupermarché {
	
	public static void main(String[] args) {
		Article banane = new Article(4011, "Bananes", 1, 50);
		Article melon = new Article(4347, "Melon gros pièce Espagne", 1.3, 30);
		
		System.out.println(banane.getLongReference());
		System.out.println(melon.getQuantiteEnStock());
		melon.approvisionner(3);
		System.out.println(melon.getQuantiteEnStock());
		System.out.println(melon.vendre(4));
		System.out.println(melon.vendre(60));
		System.out.println(banane.prixTTC());
		System.out.println(banane.equals(melon));
		System.out.println(banane.equals(banane));
		System.out.println(banane.toString());
		
	}
	
}
