
public class AddStrings implements Add {
	static String argument1, argument2;
	
	public int sum() {	
		validate(argument1);
		validate(argument2);		
		return Integer.parseInt(argument1) + Integer.parseInt(argument2);
	}

}
