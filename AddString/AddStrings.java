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


	public static void main(String[] args) {

		if (args.length == 1 || args.length > 2)
		{
			System.err.println("Useage: AddString integer1 integer2");
			return;
		}
		if(args.length == 0) {
			System.out.println("There were no commandline arguments passed!");
		} else {
			System.out.println(new AddStrings().sum(args[0], args[1]));
		}
	}
}
