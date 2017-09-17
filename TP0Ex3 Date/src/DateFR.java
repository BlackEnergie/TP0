public class DateFR extends LaDate{
	
	public DateFR(int d, int m, int y) {
		super(m,d,y);
	}
	
	public String ToString() {
		return super.day + "/" + super.month +"/" + super.year;
	}
}
