
public class VoitureJamesBond extends Voiture{
	
	public int rouler(int pduree) {
		int distance;
		distance = pduree * 180;
		this.kilometrage += distance;
		return distance;
	}
	
}
