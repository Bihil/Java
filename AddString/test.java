
public class test extends AddStrings{

	public static void main(String[] args) {
		if (args.length == 1 || args.length > 2)
		{
			System.err.println("Useage: AddString integer1 integer2");
			return;
		}
		if(args.length == 0) {
			System.out.println("There were no commandline arguments passed!");
		} else {
			new AddStrings();
			AddStrings.argument1 = args[0];
			AddStrings.argument2 = args[1];
			System.out.println(new AddStrings().sum());
		}	
	}

}
