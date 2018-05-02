
public class test {
	
	public static boolean containsOnlyDigits(final String value) {
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void validate(String variable) {
		if(variable== null) {
			throw new NullPointerException();
		}
		if(variable.length() == 0) {
			throw new IllegalArgumentException("[ " + variable + " ] is not a positive integer.");
		}
		if(!containsOnlyDigits(variable)) {
			throw new IllegalArgumentException("[ " + variable + " ] is not a positive integer.");
		}
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
			validate(args[0]);
			validate(args[1]);
			System.out.println(new AddStrings(args[0], args[1]).sum());
			System.out.println(new AddNumbers(Integer.parseInt(args[0]),Integer.parseInt(args[1])).sum());
		}	
	}

}
