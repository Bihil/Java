
public class AddStrings {

	
	public static void main(String[] args) {
		boolean isValidNumber = false; 		// testing if the arguments are valid number 
		int total = 0;						// the sum of the arguments
		//check to see if the String array is empty
		if (args.length == 0)
		{
			System.out.println("There were no commandline arguments passed!");
		}
		else {
			isValidNumber = true;
			for(String argument: args) {
				try {
					total = total + Integer.parseInt(argument);
				} catch (NumberFormatException e) {
					System.out.println("arguments passed must be integers!");
				}
			}
		}
		if(isValidNumber) {
			System.out.println("The total is : " + total);
		}



	}
}
