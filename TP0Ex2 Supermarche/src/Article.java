
public class Article {
	private final static double TVA = 19.6;
	
	private long reference;
	private String intitule;
	private double prixHT;
	private int quantiteEnStock;

	public long getLongReference() {
		return reference;
	}

	public void setLongReference(long longReference) {
		this.reference = longReference;
	}


	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}

	public void setQuantiteEnStock(int quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}
	
	public Article(long plongReference, String pintitule, double pprixHT, int pquantiteEnStock) {
		this.reference = plongReference;
		this.intitule = pintitule;
		this.prixHT = pprixHT;
		this.quantiteEnStock = pquantiteEnStock;
	}
	
	public void approvisionner(int NombreUnites) {
		this.quantiteEnStock += NombreUnites;
	}
	
	public boolean vendre(int nombreUnites) {
		boolean res = false;
		if (nombreUnites <= this.quantiteEnStock)
				res = true;
		return res;
	}
	
	public double prixTTC() {
		return this.prixHT + (this.prixHT * (TVA/100));
	}
	
	public String toString() {
		String str = this.reference + " " + this.intitule + " (" + this.prixTTC() + "€)";
		return str;
	}
	
	public boolean equals(Article unArticle){
		boolean res = false;
		if (this.reference == unArticle.reference) {
			res = true;
		}
		return res;
	}
	
}
