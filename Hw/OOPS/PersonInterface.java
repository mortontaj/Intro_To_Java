package People;

public interface PersonInterface {	
	static final String ORGINIZATION = "BANK";
	
	public static double stockPrice(int num) {
		return (Math.round(Math.random() * 10 * num) );
	}
	
	public static int marketCap(int num) {
		return (int) Math.round((stockPrice(num) * 1000000000));
	}
	
	
	

}
