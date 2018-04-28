import java.util.regex.Pattern;
public class AddStrings {
	private static Pattern onlyDigits = Pattern.compile("\\A[0-9]*\\z");
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	private void validate(String x) {
		if(x== null) {
			throw new NullPointerException();
		}
		if(x.length() == 0) {
			throw new IllegalArgumentException("[ " + x + " ] is not a positive integer.");
		}
		if(!onlyDigits.matcher(x).matches()) {
			throw new IllegalArgumentException("[ " + x + " ] is not a positive integer.");
		}
	}


	public int sum(String a, String b) {		
		validate(a);
		validate(b);
		setTotal(Integer.parseInt(a) + Integer.parseInt(b));
		return getTotal();
	}

}
