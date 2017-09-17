
public class LaDate {
	protected int year;
	protected int month;
	protected int day;
	
	public LaDate(int y, int m, int d ) {
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	public int getDay() {
	return this.day;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setDay(int d) {
		this.day = d;
	}
	
	public void setMonth(int m) {
		this.month = m;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public String ToString() {
		return this.month + "/" + this.day + "/" + this.year;
	}
}
